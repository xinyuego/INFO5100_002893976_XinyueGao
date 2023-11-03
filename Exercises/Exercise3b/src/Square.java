class Square extends Shape {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double calculateArea() {
        return this.side * this.side;
    }

    public double calculatePerimeter() {
        return 4.0 * this.side;
    }
}
