package main.java.chess.pieces;

public class King extends Piece{
    boolean isFirstMove = false ;

    public King(char symbol, boolean isWhite) {
        super(symbol, isWhite);
    }

    @Override
    public boolean isValidMove(Piece[][] board, int fromX, int fromY, int toX, int toY) {
        int deltaX = Math.abs(toX - fromX);
        int deltaY = Math.abs(toY - fromY);

        Piece piece = board[fromY][fromX];
        Piece targetPiece = board[toY][toX];
        if (deltaY == 0 && deltaX == 2 && isFirstMove==false ){

            return true;
        }

        if (targetPiece != null && piece.isWhite() ==targetPiece.isWhite() ) return false ;
            if (deltaX <= 1 && deltaY <= 1){
                isFirstMove = true ;
                return true;
            }else {
                return false;
            }
    }
}
