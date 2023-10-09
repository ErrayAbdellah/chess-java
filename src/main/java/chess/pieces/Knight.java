package main.java.chess.pieces;

public class Knight extends Piece {
    public Knight(char symbol , boolean isWhite) {
        super(symbol, isWhite);
    }

    @Override
    public boolean isValidMove(Piece[][] board, int fromX, int fromY, int toX, int toY) {
        int deltaX = Math.abs(toX - fromX);
        int deltaY = Math.abs(toY - fromY);
        Piece piece = board[fromY][fromX];
        Piece targetPiece = board[toY][toX];

        if (targetPiece != null && piece.isWhite() ==targetPiece.isWhite() ) return false ;
        return (deltaX == 2 && deltaY == 1) || (deltaX == 1 && deltaY == 2);
    }
}