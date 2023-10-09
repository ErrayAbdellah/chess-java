package main.java.chess;

import main.java.chess.pieces.*;


import java.util.Scanner;

public class ChessGame {
    public static void main(String[] args) {

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

            if (piece != null && piece.isWhite() == isWhiteTurn) {
                if (piece.isValidMove(board, fromX, fromY, toX, toY)) {

                    Piece savedPiece = board[toY][toX];
                    board[toY][toX] = piece;
                    board[fromY][fromX] = null;

                    boolean isCheck = Chessboard.isKingInCheck(board, isWhiteTurn);

                    board[fromY][fromX] = piece;
                    board[toY][toX] = savedPiece;

                    if (!isCheck) {
                        board[toY][toX] = piece;
                        board[fromY][fromX] = null;

                        Chessboard.printBoard(board);
                        isWhiteTurn = !isWhiteTurn;
                    } else {
                        System.out.println("Invalid move. Your king would be in check.");
                    }
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            } else {
                System.out.println("It's not your turn to move that piece. Try again.");
            }
        }
    }
}

