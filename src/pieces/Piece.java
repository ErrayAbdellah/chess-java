package pieces;

public class Piece {

    private int moveCount ;
    private Color color ;
    private Position position;

    public Piece(){}

    public Piece(int moveCount, Color color, Position position) {
        this.moveCount = moveCount;
        this.color = color;
        this.position = position;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void setMoveCount(int moveCount) {
        this.moveCount = moveCount;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "moveCount=" + moveCount +
                ", color=" + color +
                ", position=" + position +
                '}';
    }
}



