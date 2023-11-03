import java.io.*;
public class SerializationTest {
    public static void main(String[] args) {
        // Demonstrate polymorphism
        Shape[] shapes = new Shape[5];
        shapes[0] = new Triangle("Red", 5, 12, 13);
        shapes[1] = new Rectangle("Blue", 6, 8);
        shapes[2] = new Circle("Green", 4);
        shapes[3] = new Square("Yellow", 7);
        shapes[4] = new Triangle("Purple", 3, 4, 5);

        for (Shape shape : shapes) {
            try {
                // Serialize
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(shape.shapeType + ".ser"));
                oos.writeObject(shape);
                oos.close();

                // Deserialize
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(shape.shapeType + ".ser"));
                Shape deserializedShape = (Shape) ois.readObject();
                ois.close();

                // Test deserialized object
                System.out.println("Deserialized " + shape.shapeType + ":");
                System.out.println("Area: " + deserializedShape.calculateArea());
                System.out.println("Perimeter: " + deserializedShape.calculatePerimeter() + "\n");
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}