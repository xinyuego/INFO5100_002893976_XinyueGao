public class Main {
    public static void main(String[] args) {
        // Demonstrate polymorphism
        Shape[] shapes = new Shape[5];
        shapes[0] = new Triangle("White", 7, 8, 9);
        shapes[1] = new Rectangle("Blue", 10, 8);
        shapes[2] = new Circle("Red", 8);
        shapes[3] = new Square("Yellow", 4);
        shapes[4] = new Triangle("Purple", 3, 4, 5);

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println();
        }
    }


}
