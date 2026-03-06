package oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes squareShape = new Square();

        shape.area();
        circle.area();
        square.area();
        squareShape.area();

    }
}
