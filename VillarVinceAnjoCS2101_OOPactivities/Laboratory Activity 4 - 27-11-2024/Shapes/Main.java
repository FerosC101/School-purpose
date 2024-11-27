import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(17);
        Rectangle rectangle = new Rectangle(12, 17);
        Triangle triangle = new Triangle(2, 7, 25);

        //collection of shapes
        Shape[] shapes = { square, rectangle, triangle };
        ShapeCollection shapeCollection = new ShapeCollection(shapes);

        //for computing and printing the perimeter and area
        shapeCollection.getPropertyValues();
    }
}