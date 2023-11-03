import java.io.*;

public abstract class Shape implements Serializable{
    private String color;
    public static String shapeType = "Shape";

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public String toString() {
        return "This is a " + this.color + " " + shapeType;
    }



}
