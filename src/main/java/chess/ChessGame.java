package main.java.chess;

import main.java.chess.pieces.*;


import java.util.Scanner;

public class ChessGame {
    public static void main(String[] args) {
        boolean isFirstMovePawn = false  ;

        Scanner scanner = new Scanner(System.in);
        Piece[][] board = Chessboard.createEmptyChessBoard();
        Chessboard.printBoard(board);

        boolean isWhiteTurn = true;

        while (true) {
            System.out.print("Enter the current position : ");
            String from = scanner.next();
            System.out.print("Enter the target position : ");
            String to = scanner.next();

            int fromX = from.charAt(0) - 'a';
            int fromY = 7 - (from.charAt(1) - '1');

            int toX = to.charAt(0) - 'a';
            int toY = 7 - (to.charAt(1) - '1');

            Piece piece = board[fromY][fromX];
           // if ((isWhiteTurn && Character.isUpperCase(piece.)) || (!isWhiteTurn && Character.isLowerCase(piece))) {

            if (piece != null && piece.isValidMove(board, fromX, fromY, toX, toY)) {
                    board[toY][toX] = board[fromY][fromX];
                    board[fromY][fromX] = null ;

                    Chessboard.printBoard(board);
                    isWhiteTurn = !isWhiteTurn;
                } else {
                    System.out.println("Invalid move. Try again.");
                }
//            } else {
//                System.out.println("It's not your turn to move that piece. Try again.");
//            }
        }
    }
}

