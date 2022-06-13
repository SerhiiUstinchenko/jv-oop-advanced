package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square() {
    }

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drowFigure() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: "
                + side + " units, color: " + getColor());
    }
}
