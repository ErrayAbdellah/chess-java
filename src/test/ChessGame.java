package test;

import java.util.Scanner;

public class ChessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = createEmptyChessBoard();

        printBoard(board);

        while (true) {
            System.out.print("Enter the current position (e.g., 'a2'): ");
            String from = scanner.next();
            System.out.print("Enter the target position (e.g., 'a4'): ");
            String to = scanner.next();

            int fromX = from.charAt(0) - 'a';
//            System.out.println("from : " + from);
//            System.out.println("x = "+ fromX );
            int fromY = 7 - (from.charAt(1) - '1');
            int toX = to.charAt(0) - 'a';
            int toY = 7 - (to.charAt(1) - '1');

            if (isValidMove(board, fromX, fromY, toX, toY)) {
                board[toY][toX] = board[fromY][fromX];
                board[fromY][fromX] = '-';
                printBoard(board);
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
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

    private static boolean isValidMove(char[][] board, int fromX, int fromY, int toX, int toY) {
        if (fromX < 0 || fromX >= 8 || fromY < 0 || fromY >= 8 ||
                toX < 0 || toX >= 8 || toY < 0 || toY >= 8) {
            return false;
        }
        char piece = board[fromY][fromX];
        char targetPiece = board[toY][toX];
        int deltaY = toY - fromY;
        System.out.println("piece : "+ board[fromY][fromX]);
        System.out.println("targetPiece : "+  board[toY][toX]);
        System.out.println("toY : "+ toY);
        System.out.println("fromY : "+ fromY);
        // White pawn movement
        if (piece == 'P') {
            if (deltaY == 1 && toX == fromX && targetPiece == '-') {
                return true;
            } else if (deltaY == 2 && fromY == 1 && deltaY == 2 && toX == fromX && targetPiece == '-' && board[fromY + 1][fromX] == '-') {
                return true;
            } else if (deltaY == 1 && Math.abs(toX - fromX) == 1 && targetPiece != '-') {
                return true;
            }
        }
        // Black pawn movement
        else if (piece == 'p') {
            if (deltaY == -1 && toX == fromX && targetPiece == '-') {
                return true;
            } else if (deltaY == -2 && fromY == 6 && deltaY == -2 && toX == fromX && targetPiece == '-' && board[fromY - 1][fromX] == '-') {
                return true;
            } else if (deltaY == -1 && Math.abs(toX - fromX) == 1 && targetPiece != '-') {
                return true;
            }
        }

        return false;
    }
}
