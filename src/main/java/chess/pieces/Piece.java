    package main.java.chess.pieces;

    public abstract class Piece {

        private char symbol;
        private boolean isWhite; // Indicates the piece's color (white or black)
        private boolean isFirstMove = true;

        public Piece(char symbol, boolean isWhite) {
            this.symbol = symbol;
            this.isWhite = isWhite;
        }

        public void setSymbol(char symbol) {
            this.symbol = symbol;
        }

        public void setWhite(boolean white) {
            isWhite = white;
        }

        public boolean isFirstMove() {
            return isFirstMove;
        }

        public void setFirstMove(boolean firstMove) {
            isFirstMove = firstMove;
        }

        public char getSymbol() {
            return symbol;
        }

        public boolean isWhite() {
            return isWhite;
        }

        public abstract boolean isValidMove(Piece[][] board, int fromX, int fromY, int toX, int toY);

    //    private int oldX ;
    //    private int oldY;
    //    private Color color ;
    //    private Position position;
    //
    //    public Piece(){}
    //
    //    public Piece(int moveCount, Color color, Position position) {
    //        //this.moveCount = moveCount;
    //        this.color = color;
    //        this.position = position;
    //    }
    //
    //    public Color getColor() {
    //        return color;
    //    }
    //
    //    public void setColor(Color color) {
    //        this.color = color;
    //    }
    //
    //    public Position getPosition() {
    //        return position;
    //    }
    //
    //    public void setPosition(Position position) {
    //        this.position = position;
    //    }
    //
    //    @Override
    //    public String toString() {
    //        return "Piece{" +
    //                ", color=" + color +
    //                ", position=" + position +
    //                '}';
    //    }

        @Override
        public String toString() {
            return "Piece{" +
                    "symbol=" + symbol +
                    ", isWhite=" + isWhite +
                    ", isFirstMove=" + isFirstMove +
                    '}';
        }
    }



