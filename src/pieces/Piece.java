package pieces;

public class Piece {

    private int oldX ;
    private int oldY;
    private Color color ;
    private Position position;

    public Piece(){}

    public Piece(int moveCount, Color color, Position position) {
        //this.moveCount = moveCount;
        this.color = color;
        this.position = position;
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
                ", color=" + color +
                ", position=" + position +
                '}';
    }
}



