package Program;

import entitie.Circle;
import entitie.Rectangle;
import service.Shape;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Shape> myshapes = new ArrayList<>();

        myshapes.add(new Circle(2.0));
        myshapes.add(new Rectangle(3.0, 2.));

        System.out.printf("Total area is: %.2f", totalArea(myshapes));

    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0;
        for (Shape l : list) {
            sum += l.area();
        }
        return sum;
    }

}
