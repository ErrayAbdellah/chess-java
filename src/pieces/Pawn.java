package pieces;

public class Pawn extends Piece  {


    private boolean isValidMove(char[][] board, int fromX, int fromY, int toX, int toY) {
        if (fromX < 0 || fromX >= 8 || fromY < 0 || fromY >= 8 ||
                toX < 0 || toX >= 8 || toY < 0 || toY >= 8) {
            return false;
        }
        char piece = board[fromY][fromX];
        char targetPiece = board[toY][toX];
        int deltaY = toY - fromY;


        if (piece == 'P' && getColor() == Color.black) {
            if (deltaY == 1 && toX == fromX && targetPiece == '-') {
                return true;
            } else if (deltaY == 2 && fromY == 1 && deltaY == 2 && toX == fromX && targetPiece == '-' && board[fromY + 1][fromX] == '-') {
                return true;
            } else if (deltaY == 1 && Math.abs(toX - fromX) == 1 && targetPiece != '-') {
                return true;
            }
        }
        else if (piece == 'p' && getColor() == Color.black ) {
            if (deltaY == -1 && toX == fromX && targetPiece == '-') {
                return true;
            } else if (deltaY == -2 && fromY == 6 && deltaY == -2 && toX == fromX && targetPiece == '-' && board[fromY - 1][fromX] == '-') {
                return true;
            } else if (deltaY == -1 && Math.abs(toX - fromX) == 1 && targetPiece != '-') {
                return true;
            }
        }
        return false;
    }

}
