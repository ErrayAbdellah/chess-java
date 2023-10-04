package main.java.chess.pieces;

public class Bishop extends Piece{

    public Bishop(char symbol, boolean isWhite) {
        super(symbol, isWhite);
    }
    @Override
    public boolean isValidMove(Piece[][] board, int fromX, int fromY, int toX, int toY) {
        int deltaX = Math.abs(toX - fromX);
        int deltaY = Math.abs(toY - fromY);

        return deltaX == deltaY && validMove(board, fromX, fromY, toX, toY);
    }

    private boolean validMove(Piece[][] board, int fromX, int fromY, int toX, int toY) {
        int xDirection = (toX > fromX) ? 1 : -1;
        int yDirection = (toY > fromY) ? 1 : -1;

        int x = fromX + xDirection;
        int y = fromY + yDirection;

        while (x != toX && y != toY) {
            if (board[y][x].getSymbol() != '-') {
                return false;
            }
            x += xDirection;
            y += yDirection;
        }

        return true;
    }

}
