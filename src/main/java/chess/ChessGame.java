package main.java.chess;

import main.java.chess.pieces.Pawn;
import pieces.Rook;

import java.util.Scanner;

public class ChessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = Chessboard.createEmptyChessBoard();

        Chessboard.printBoard(board);
        while (true) {
            System.out.print("Enter the current position ('a2'): ");
            String from = scanner.next();
            System.out.print("Enter the target position ('a4'): ");
            String to = scanner.next();

            int fromX = from.charAt(0) - 'a';
            int fromY = 7 - (from.charAt(1) - '1');

            int toX = to.charAt(0) - 'a';
            int toY = 7 - (to.charAt(1) - '1');
            switch (board[fromY][fromX]) {
                case 'p':
                    System.out.println("pawn");
                    Pawn pawn = new Pawn('P',true);
                    if (pawn.isValidMove(board, fromX, fromY, toX, toY)) {
                        board[toY][toX] = board[fromY][fromX];
                        board[fromY][fromX] = '-';
                        Chessboard.printBoard(board);
                    } else {
                        System.out .println("Invalid move. Try again.");
                    }
                    break;
                case 'r':
                    Rook rook = new Rook('r',true);
                    //System.out.println("rook");
                    if (rook.isValidMove(board, fromX, fromY, toX, toY)) {
                        board[toY][toX] = board[fromY][fromX];
                        board[fromY][fromX] = '-';
                        Chessboard.printBoard(board);
                    } else {
                        System.out.println("Invalid move. Try again.");
                    }
                    break;
            }

        }
    }


}
