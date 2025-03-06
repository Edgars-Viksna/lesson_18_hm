import java.util.Objects;

public class Rectangle extends GeomFigure {

    public final double side1;
    public final double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calcArea() {
        return side1 * side2;
    }

    @Override
    public String toString() {
        return String.format("Rectangle with side 1 %.2f cm., side 2 %.2f cm. and area %.2f square cm."
                , side1, side1, calcArea());
    }


}
