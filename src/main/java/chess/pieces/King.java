package main.java.chess.pieces;

public class King extends Piece{

    public King(char symbol, boolean isWhite) {
        super(symbol, isWhite);
    }

    @Override
    public boolean isValidMove(Piece[][] board, int fromX, int fromY, int toX, int toY) {
        int deltaX = Math.abs(toX - fromX);
        int deltaY = Math.abs(toY - fromY);


        return (deltaX <= 1 && deltaY <= 1);
    }
}
