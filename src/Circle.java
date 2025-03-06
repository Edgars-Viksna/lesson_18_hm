import java.util.Objects;

public class Circle extends GeomFigure {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return String.format("Circle with radius %.2f cm. and area %.2f square cm.", radius, calcArea());
    }


}

