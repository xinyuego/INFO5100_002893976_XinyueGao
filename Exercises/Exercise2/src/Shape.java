public abstract class Shape {
    private String color;


    public Shape(String color) {
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
    public static String shapeType = "Shape";
    @Override
    public String toString() {
        return "This is a " + color + " " + shapeType;
    }

}
 class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;

     public Triangle(String color, double side1, double side2, double side3) {
         super(color);
         this.side1 = side1;
         this.side2 = side2;
         this.side3 = side3;
     }
     @Override
     public double calculateArea() {
         double s = (side1 + side2 + side3) / 2;
         return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
     }
     @Override
     public  double calculatePerimeter(){
         return side1+side2+side3;

     }



 }

class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public  double calculateArea(){
        return length*width;
    }
    @Override
    public  double calculatePerimeter(){
        return 2*(length+width);

    }

}

 class Circle extends Shape{
     private double radius;

     public Circle(String color, double radius) {
         super(color);
         this.radius = radius;
     }
     @Override
     public  double calculateArea(){
         return Math.PI*radius*radius;
     }

     @Override
     public double calculatePerimeter() {
         return 2 * Math.PI * radius;
     }
 }

class Square extends Shape{
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }
    @Override
    public  double calculateArea(){
        return side*side;
    }

    @Override
    public double calculatePerimeter() {
        return 4*side;
    }
}
