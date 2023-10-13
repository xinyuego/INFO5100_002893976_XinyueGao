public class Pillow {
    private double price;
    private String material;
    private String shape;
    private String color;
    private String size;
    private double weight;
    private double height;
    private String filler;
//constructor
    public Pillow(double price, String material, String shape, String color, String size, double weight, double height, String filler) {
        this.price = price;
        this.material = material;
        this.shape = shape;
        this.color = color;
        this.size = size;
        this.weight = weight;
        this.height = height;
        this.filler = filler;
        System.out.println("Pillow instance is created with filler:"+filler);
    }
    //method 1
    public void displayInfo(){

    }
    //method 2
    public void printShape(){

    }
    //method 3
    public void printColor(){

    }
}
