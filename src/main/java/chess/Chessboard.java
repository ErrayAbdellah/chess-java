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
        board[0][7] = 'R';
        board[7][7] = 'r';

        board[0][1] = 'N';
        board[0][6] = 'N';
        board[7][1] = 'n';
        board[7][6] = 'n';

        board[0][2] = 'B';
        board[0][5] = 'B';
        board[7][2] = 'b';
        board[7][5] = 'b';

        board[0][3] = 'Q';
        board[0][4] = 'K';
        board[7][4] = 'k';
        board[7][3] = 'q';
        return board;
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 8; i++) {
            System.out.print("("+(8-i) +") ");
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n \ta b c d e f g h ");
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
