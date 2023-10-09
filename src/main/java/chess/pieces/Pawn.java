package main.java.chess.pieces;

public class Pawn extends Piece {
    boolean isFirstMove = false ;
    public Pawn(char symbol, boolean isWhite) {
        super(symbol, isWhite);
    }

    @Override
    public boolean isValidMove(Piece[][] board ,int fromX, int fromY, int toX, int toY) {
        if (fromX < 0 || fromX >= 8 || fromY < 0 || fromY >= 8 ||
                toX < 0 || toX >= 8 || toY < 0 || toY >= 8) {
            return false;
        }
        Piece piece = board[fromY][fromX];
        Piece targetPiece = board[toY][toX];
        int deltaY = toY - fromY;

        if (!isWhite() && piece.getSymbol() == 'P') {
            if (deltaY == 1 && toX == fromX && targetPiece == null ) {
                isFirstMove = true ;
                return true;
            } else if (deltaY == 2 && isFirstMove == false  && toX == fromX && targetPiece == null && board[fromY + 1][fromX] == null) {
                isFirstMove = true ;
                return true;
            } else if (deltaY == 1 && Math.abs(toX - fromX) == 1 && targetPiece != null && targetPiece.isWhite()) {
                isFirstMove = true ;
                return true;
            }
        }
        else if (isWhite() && piece.getSymbol() == 'p' ) {
            if (deltaY == -1 && toX == fromX && targetPiece == null) {
                isFirstMove = true ;
                return true;
            } else if (deltaY == -2 && isFirstMove == false &&deltaY == -2 && toX == fromX && targetPiece == null && board[fromY - 1][fromX] == null) {
                isFirstMove = true ;
                return true;
            } else if (deltaY == -1 && Math.abs(toX - fromX) == 1 && targetPiece != null && !targetPiece.isWhite() ) {
                isFirstMove = true ;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pawn{" +
                "isFirstMove=" + isFirstMove +
                '}';
    }
}
