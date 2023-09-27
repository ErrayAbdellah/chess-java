package main.java.chess.pieces;

public class King extends Piece{

    public King(char symbol, boolean isWhite) {
        super(symbol, isWhite);
    }

    @Override
    public boolean isValidMove(char[][] board, int fromX, int fromY, int toX, int toY) {
        int deltaX = Math.abs(toX - fromX);
        int deltaY = Math.abs(toY - fromY);

        // A king can move one square in any direction: horizontally, vertically, or diagonally.
        return (deltaX <= 1 && deltaY <= 1);
    }
}
