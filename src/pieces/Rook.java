package pieces;

import main.java.chess.pieces.Piece;

public class Rook extends Piece {

    public Rook(char symbol, boolean isWhite) {
        super(symbol, isWhite);
    }

    @Override
    public boolean isValidMove(char[][] board, int fromX, int fromY, int toX, int toY) {
        if (fromX < 0 || fromX >= 8 || fromY < 0 || fromY >= 8 ||
                toX < 0 || toX >= 8 || toY < 0 || toY >= 8) {
            return false;
        }

        char piece = board[fromY][fromX];
        //char targetPiece = board[toY][toX];
        int deltaX = Math.abs(toX - fromX);
        int deltaY = Math.abs(toY - fromY);

        if (piece == 'R' || piece == 'r') {
            if (deltaX == 0 && deltaY > 0) {

                int stepY = (toY > fromY) ? 1 : -1;
                int y = fromY + stepY;
                while (y != toY) {
                    if (board[y][fromX] != '-') {
                        return false;
                    }
                    y += stepY;
                }
                return true;
            } else if (deltaY == 0 && deltaX > 0) {

                int stepX = (toX > fromX) ? 1 : -1;
                int x = fromX + stepX;
                while (x != toX) {
                    if (board[fromY][x] != '-') {
                        return false;
                    }
                    x += stepX;
                }
                return true;
            }
        }

        return false;
    }
}
