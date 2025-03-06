import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*
Реализовать 3 класса геометрических фигур: круг (Circle), квадрат(Square) и прямоугольник (Rectangle).
У круга есть радиус, у квадрата и прямоугольника -стороны. В каждом классе должен быть метод
расчета площади фигуры calcArea().
В main создать List из нескольких разных фигур и посчитать суммарную площадь всех фигур в List
Напишите  метод, который проверит, есть ли заданная фигура в List
Написать метод, который формирует List из фигур, с площадью больше, чем заданное значение
 */

        List<GeomFigure> figureList = new ArrayList<GeomFigure>();
        figureList.add(new Circle(4));
        figureList.add(new Circle(8));
        figureList.add(new Circle(16));
        figureList.add(new Square(5));
        figureList.add(new Square(10));
        figureList.add(new Square(20));
        figureList.add(new Rectangle(5, 10));
        figureList.add(new Rectangle(10, 20));
        figureList.add(new Rectangle(15, 25));

        printList(figureList);
        System.out.println(" --------");

        totalArea(figureList);
        System.out.println(" --------");
        System.out.println(" --------");

        printList(filterByArea(figureList, 350));
        System.out.println(" --------");

        exist(figureList, new Circle(4));
        exist(figureList, new Circle(5));
        exist(figureList, new Rectangle(3, 8));
        exist(figureList, new Rectangle(5, 10));
        exist(figureList, new Square(5));
        exist(figureList, new Square(8));
        System.out.println(" --------");

    }

    // -------------Methods----------
    private static void totalArea(List<GeomFigure> figureList) {
        double totalArea = 0;
        for (int i = 0; i < figureList.size(); i++) {
            totalArea = totalArea + figureList.get(i).calcArea();
        }
        System.out.printf("Total area of all figures is %.2f square cm.", totalArea);
    }

    private static void printList(List<GeomFigure> figureList) {
        for (int i = 0; i < figureList.size(); i++) {
            System.out.println(figureList.get(i));
        }
    }

    private static List<GeomFigure> filterByArea(List<GeomFigure> figureList, double minArea) {
        List<GeomFigure> filtered = new ArrayList<>();
        for (int i = 0; i < figureList.size(); i++) {
            GeomFigure geomFigure = figureList.get(i);
            if (figureList.get(i).calcArea() >= minArea) {
                filtered.add(geomFigure);
            }
        }
        return filtered;
    }


    private static void exist(List<GeomFigure> figureList, GeomFigure figure) {
        for (int i = 0; i < figureList.size(); i++) {
            if (figureList.get(i).toString().equals(figure.toString())) {
                System.out.println(figure + "   already exist");
                return;
            }
        }
        System.out.println(figure + "   does not exist");
    }


}