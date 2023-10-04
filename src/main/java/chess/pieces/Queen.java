package main.java.chess.pieces;

public class Queen extends Piece {
    public Queen(char symbol, boolean isWhite) {
        super(symbol, isWhite);
    }

    @Override
    public boolean isValidMove(Piece[][] board, int fromX, int fromY, int toX, int toY) {
        int deltaX = Math.abs(toX - fromX);
        int deltaY = Math.abs(toY - fromY);


        return (deltaX == 0 || deltaY == 0 || deltaX == deltaY) && validMove(board, fromX, fromY, toX, toY);
    }


    private boolean validMove(Piece[][] board, int fromX, int fromY, int toX, int toY) {
        int xDirection = (toX > fromX) ? 1 : (toX < fromX) ? -1 : 0;
        int yDirection = (toY > fromY) ? 1 : (toY < fromY) ? -1 : 0;

        int x = fromX + xDirection;
        int y = fromY + yDirection;

        while (x != toX || y != toY) {
            if (board[y][x].getSymbol() != '-') {
                return false;
            }
            x += xDirection;
            y += yDirection;
        }

        return true;
    }
}
