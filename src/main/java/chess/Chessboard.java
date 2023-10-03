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

        board[5][3] = 'r';
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

}
