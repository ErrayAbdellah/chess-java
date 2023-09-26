package main.java.chess;

public class Chessboard {
    private char[][] board;

    public Chessboard() {
        board = createEmptyChessBoard();
    }
    public static char[][] createEmptyChessBoard() {
        char[][] board = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = '-';
            }
        }
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

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
//    private char[][] createEmptyChessBoard() {
//        char[][] board = new char[8][8];
//        // Initialize the chessboard with empty squares
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                board[i][j] = '-';
//            }
//        }
//        // Add pawns to the board
//        for (int i = 0; i < 8; i++) {
//            board[1][i] = 'P';
//            board[6][i] = 'p';
//        }
//        // Add other pieces (rooks, knights, bishops, queens, kings) here
//        // Modify the board array accordingly
//        return board;
//    }

//    public void printBoard() {
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                System.out.print(board[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

//    public boolean movePiece(String from, String to) {
//        // Implement your piece movement validation logic here
//        int fromX = from.charAt(0) - 'a';
//        int fromY = 7 - (from.charAt(1) - '1');
//        int toX = to.charAt(0) - 'a';
//        int toY = 7 - (to.charAt(1) - '1');

        // Check if the move is valid and update the board if it is
//        if (isValidMove(fromX, fromY, toX, toY)) {
//            board[toY][toX] = board[fromY][fromX];
//            board[fromY][fromX] = '-';
//            return true;
//        } else {
//            return false;
//        }
//    }

//    private boolean isValidMove(int fromX, int fromY, int toX, int toY) {
//        // Implement your piece-specific movement rules here
//        // Return true if the move is valid, false otherwise
//        // Example: Implement rules for pawn, rook, knight, etc.
//        return false;
//    }
}
