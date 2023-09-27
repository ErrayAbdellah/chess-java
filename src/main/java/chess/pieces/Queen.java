package main.java.chess.pieces;

public class Queen extends Piece {
    public Queen(char symbol, boolean isWhite) {
        super(symbol, isWhite);
    }

    @Override
    public boolean isValidMove(char[][] board, int fromX, int fromY, int toX, int toY) {
        int deltaX = Math.abs(toX - fromX);
        int deltaY = Math.abs(toY - fromY);

        // A queen can move like a rook (horizontally and vertically) or like a bishop (diagonally).
        return (deltaX == 0 || deltaY == 0 || deltaX == deltaY) && isPathClear(board, fromX, fromY, toX, toY);
    }

    // Helper method to check if the path is clear for a queen's move.
    private boolean isPathClear(char[][] board, int fromX, int fromY, int toX, int toY) {
        int xDirection = (toX > fromX) ? 1 : (toX < fromX) ? -1 : 0;
        int yDirection = (toY > fromY) ? 1 : (toY < fromY) ? -1 : 0;

        int x = fromX + xDirection;
        int y = fromY + yDirection;

        while (x != toX || y != toY) {
            if (board[y][x] != '-') {
                return false;
            }
            x += xDirection;
            y += yDirection;
        }

        return true;
    }
}
