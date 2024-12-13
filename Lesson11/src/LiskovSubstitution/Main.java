package LiskovSubstitution;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2, 3);
        printArea(rectangle);

        Rectangle rectangle2 = new Square(2);
        rectangle2.setHeight(3);
        rectangle2.setWidth(4);
        printArea(rectangle2);
    }

    private static void printArea(Rectangle rectangle) {
        System.out.println("rectangle.getArea() = " + rectangle.getArea());
    }
}
