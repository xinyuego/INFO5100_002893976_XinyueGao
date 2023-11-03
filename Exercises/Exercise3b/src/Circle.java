class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double calculatePerimeter() {
        return 6.283185307179586 * this.radius;
    }
}