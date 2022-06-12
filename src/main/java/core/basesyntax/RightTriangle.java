package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle() {
    }

    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public int getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void drowFigure() {
        System.out.println("Figure: right-triangle , area: " + getArea() + " sq.units, first leg: "
                + firstLeg + " units, second leg: " + secondLeg + " units, color: " + getColor());
    }
}
