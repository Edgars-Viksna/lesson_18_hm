import java.util.Objects;

public class Square extends GeomFigure {
    public final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calcArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return String.format("Square with side %.2f cm. and area %.2f square cm.", side, calcArea());
    }


}

