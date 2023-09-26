package test;

import java.util.Scanner;

public class ChessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = createEmptyChessBoard();

        printBoard(board);

        while (true) {
            System.out.print("Enter the current position ('a2'): ");
            String from = scanner.next();
            System.out.print("Enter the target position ('a4'): ");
            String to = scanner.next();

            int fromX = from.charAt(0) - 'a';
            int fromY = 7 - (from.charAt(1) - '1');

            int toX = to.charAt(0) - 'a';
            int toY = 7 - (to.charAt(1) - '1');
            switch (board[fromY][fromX]){
                case 'p'  :
                    System.out.println("pawn");
//                    if (isValidMove(board, fromX, fromY, toX, toY)) {
//                        board[toY][toX] = board[fromY][fromX];
//                        board[fromY][fromX] = '-';
//                        printBoard(board);
//                    } else {
//                        System.out .println("Invalid move. Try again.");
//                    }
                    break;
                case 'r' :
                    System.out.println("rook");
                    if (isValidMoveRook(board, fromX, fromY, toX, toY)) {
                        board[toY][toX] = board[fromY][fromX];
                        board[fromY][fromX] = '-';
                        printBoard(board);
                    } else {
                        System.out .println("Invalid move. Try again.");
                    }
                    break;
            }

        }
    }

    private static boolean isValidMoveRook(char[][] board, int fromX, int fromY, int toX, int toY) {
        if (fromX < 0 || fromX >= 8 || fromY < 0 || fromY >= 8 ||
                toX < 0 || toX >= 8 || toY < 0 || toY >= 8) {
            return false;
        }

        char piece = board[fromY][fromX];
        //char targetPiece = board[toY][toX];
        int deltaX = Math.abs(toX - fromX);
        int deltaY = Math.abs(toY - fromY);

        if (piece == 'R' || piece == 'r') {
            if (deltaX == 0 && deltaY > 0) {

                int stepY = (toY > fromY) ? 1 : -1;
                int y = fromY + stepY;
                while (y != toY) {
                    if (board[y][fromX] != '-') {
                        return false;
                    }
                    y += stepY;
                }
                return true;
            } else if (deltaY == 0 && deltaX > 0) {

                int stepX = (toX > fromX) ? 1 : -1;
                int x = fromX + stepX;
                while (x != toX) {
                    if (board[fromY][x] != '-') {
                        return false;
                    }
                    x += stepX;
                }
                return true;
            }
        }

        return false;
    }
    private static char[][] createEmptyChessBoard() {
        char[][] board = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = '-';
            }
        }
        // Add pawns to the board
        for (int i = 0; i < 8; i++) {
            board[1][i] = 'P';
            board[6][i] = 'p';
        }
        board[0][0] = 'R';
        board[7][0] = 'r';
        board[4][4] = 'r';
        board[0][7] = 'R';
        board[7][7] = 'r';
        return board;
    }

    private static void printBoard(char[][] board) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

//    private static boolean isValidMove(char[][] board, int fromX, int fromY, int toX, int toY) {
//        if (fromX < 0 || fromX >= 8 || fromY < 0 || fromY >= 8 ||
//                toX < 0 || toX >= 8 || toY < 0 || toY >= 8) {
//            return false;
//        }
//        char piece = board[fromY][fromX];
//        char targetPiece = board[toY][toX];
//        int deltaY = toY - fromY;
//
//        // White pawn movement
//
//        if (piece == 'P') {
//            if (deltaY == 1 && toX == fromX && targetPiece == '-') {
//                return true;
//            } else if (deltaY == 2 && fromY == 1 && toX == fromX && targetPiece == '-' && board[fromY + 1][fromX] == '-') {
//                return true;
//            } else if (deltaY == 1 && Math.abs(toX - fromX) == 1 && targetPiece != '-') {
//                return true;
//            }
//        }
//        // Black pawn movement
//        else if (piece == 'p') {
//            if (deltaY == -1 && toX == fromX && targetPiece == '-') {
//                return true;
//            } else if (deltaY == -2 && fromY == 6 && deltaY == -2 && toX == fromX && targetPiece == '-' && board[fromY - 1][fromX] == '-') {
//                return true;
//            } else if (deltaY == -1 && Math.abs(toX - fromX) == 1 && targetPiece != '-') {
//                return true;
//            }
//        }
//
//        return false;
//    }

}
