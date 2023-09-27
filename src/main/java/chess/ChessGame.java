package main.java.chess;

import main.java.chess.pieces.*;


import java.util.Scanner;

public class ChessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = Chessboard.createEmptyChessBoard();

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
            char piece = board[fromY][fromX];

            if ((isWhiteTurn && Character.isUpperCase(piece)) || (!isWhiteTurn && Character.isLowerCase(piece))) {

                Piece chessPiece = null;
                switch (Character.toLowerCase(piece)) {
                    case 'p':
                        chessPiece = new Pawn(piece, Character.isUpperCase(piece));
                        break;
                    case 'r':
                        chessPiece = new Rook(piece, Character.isUpperCase(piece));
                        break;
                    case 'n':
                        chessPiece = new Knight(piece, Character.isUpperCase(piece));
                        break;
                    case 'b':
                        chessPiece = new Bishop(piece, Character.isUpperCase(piece));
                        break;
                    case 'q':
                        chessPiece = new Queen(piece, Character.isUpperCase(piece));
                        break;
                    case 'k':
                        chessPiece = new King(piece, Character.isUpperCase(piece));
                        break;
                    default:
                        System.out.println("Invalid piece. Try again.");
                        break;
                }

                if (chessPiece != null && chessPiece.isValidMove(board, fromX, fromY, toX, toY)) {
                    board[toY][toX] = board[fromY][fromX];
                    board[fromY][fromX] = '-';
                    Chessboard.printBoard(board);
                    isWhiteTurn = !isWhiteTurn;
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            } else {
                System.out.println("It's not your turn to move that piece. Try again.");
            }
        }
    }
}

