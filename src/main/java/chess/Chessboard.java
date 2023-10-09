package main.java.chess;

import main.java.chess.pieces.*;

public class Chessboard {
    private Piece[][] board;

    public Chessboard() {
        board = createEmptyChessBoard();
    }
    public static Piece[][] createEmptyChessBoard() {
        Piece[][] board = new Piece[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = null ;
            }
        }
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn('P',false);
            board[6][i] = new Pawn('p',true);
        }
        board[0][0] = new Rook('R',false);
        board[7][0] = new Rook('r',true);
        board[0][7] = new Rook('R',false);
        board[7][7] = new Rook('r',true);

        board[0][1] = new Knight('N',false);
        board[0][6] = new Knight('N',false);
        board[7][1] = new Knight('n',true);
        board[7][6] = new Knight('n',true);

        board[0][2] =  new Bishop('B',false);
        board[0][5] =  new Bishop('B',false);
        board[7][2] =  new Bishop('b',true);
        board[7][5] =  new Bishop('b',true);

        board[0][3] =  new Queen('Q',false);
        board[0][4] =  new King('K',false);
        board[7][4] =  new King('k',true);
        board[7][3] =  new Queen('q',true);


        return board;
    }

    public static void printBoard(Piece[][] board) {
        for (int i = 0; i < 8; i++) {
            System.out.print("("+(8-i) +") ");
            for (int j = 0; j < 8; j++) {
                if ((board[i][j] == null))  System.out.print("- ");
                else  System.out.print(board[i][j].getSymbol() + " ");

            }
            System.out.println();
        }

        System.out.println("\n \ta b c d e f g h ");
    }

    public static boolean isKingInCheck(Piece[][] board,boolean isWhite) {

        int kingX = -1;
        int kingY = -1;
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                Piece piece = board[y][x];
                if (piece instanceof King && piece.isWhite() == isWhite) {
                    kingX = x;
                    kingY = y;
                    break;
                }
            }
            if (kingX != -1) break;
        }

        if (kingX == -1) return false;

        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                Piece piece = board[y][x];
                if (piece != null && piece.isWhite() != isWhite) {
                    if (piece.isValidMove(board, x, y, kingX, kingY)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

}
