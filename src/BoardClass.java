import java.awt.*;

public class BoardClass {
    private String[][] board = new String[8][8];

    public BoardClass() {
        board = new String[8][8];
        initializeBoard();
    }

    private void initializeBoard() {
        // Initialize the board with empty squares
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                board[row][col] = " -";
            }
        }

        // Place the initial chess pieces
        // You can represent different pieces with their symbols (e.g., "K" for King, "Q" for Queen, "P" for main.java.chess.pieces.Pawn, etc.)
        // You'll need to implement the full board setup according to the starting chess positions.
        // This is just a simplified example:
        board[0][0] = "♖"; // Rook
        board[0][1] = "♘"; // Knight
        board[0][2] = "♗"; // Bishop
        board[0][3] = "♕"; // Queen
        board[0][4] = "♔"; // King
        board[0][5] = "♗"; // Bishop
        board[0][6] = "♘"; // Knight
        board[0][7] = "♖"; // Rook

        board[7][0] = "♜"; // Rook
        board[7][1] = "♞"; // Knight
        board[7][2] = "♝"; // Bishop
        board[7][3] = "♛"; // Queen
        board[7][4] = "♚"; // King
        board[7][5] = "♝"; // Bishop
        board[7][6] = "♞"; // Knight
        board[7][7] = "♜"; // Rook

        for (int col = 0; col < 8; col++) {
            board[1][col] = "♙"; // White Pawns
            board[6][col] = "♟"; // Black Pawns
        }
    }

    public void displayBoard() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BoardClass chessBoard = new BoardClass();
        //chessBoard.displayBoard();
        String a  = "a3" ;

        int b = a.charAt(1) - '1';

        System.out.println(b);
        //System.out.println(pieces.ColorsBoard.BLACK);
    }
}
