package pieces;

public class Pawn extends Piece  {


    private static boolean isValidMove(char[][] board, int fromX, int fromY, int toX, int toY) {
        if (fromX < 0 || fromX >= 8 || fromY < 0 || fromY >= 8 ||
                toX < 0 || toX >= 8 || toY < 0 || toY >= 8) {
            return false;
        }
        char piece = board[fromY][fromX];
        char targetPiece = board[toY][toX];
        int deltaY = toY - fromY;
//        System.out.println("piece : "+ board[fromY][fromX]);
//        System.out.println("targetPiece : "+  board[toY][toX]);
//        System.out.println("toY : "+ toY);
//        System.out.println("fromY : "+ fromY);
//

        // White pawn movement
        if (piece == 'P') {
            if (deltaY == 1 && toX == fromX && targetPiece == '-') {
                return true;
            } else if (deltaY == 2 && fromY == 1 && deltaY == 2 && toX == fromX && targetPiece == '-' && board[fromY + 1][fromX] == '-') {
                return true;
            } else if (deltaY == 1 && Math.abs(toX - fromX) == 1 && targetPiece != '-') {
                return true;
            }
        }
        // Black pawn movement
        else if (piece == 'p') {
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
