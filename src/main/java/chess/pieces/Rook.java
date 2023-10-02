package main.java.chess.pieces;

public class Rook extends Piece{
    public Rook(char symbol, boolean isWhite) {
        super(symbol, isWhite);
    }

    @Override
    public boolean isValidMove(char[][] board, int fromX, int fromY, int toX, int toY) {
        if (fromX < 0 || fromX >= 8 || fromY < 0 || fromY >= 8 ||
                toX < 0 || toX >= 8 || toY < 0 || toY >= 8) {
            return false;
        }

        int deltaX = Math.abs(toX - fromX);
        int deltaY = Math.abs(toY - fromY);
        char targetPiece = board[toY][toX];

        if (!((deltaX == 0 && deltaY > 0) || (deltaX > 0 && deltaY == 0))) {
            return false;
        }

        if (deltaX > 0) {
            int stepX = (toX - fromX) / deltaX;
            int x = fromX + stepX;
            while (x != toX) {
                if (board[fromY][x] != '-') {
                    return false;
                }
                x += stepX;
            }
        }

        if (deltaY > 0) {
            int stepY = (toY - fromY) / deltaY;
            int y = fromY + stepY;
            while (y != toY) {
                if (board[y][fromX] != '-') {
                    return false;
                }
                y += stepY;
            }
        }

        return true;

    }
}
