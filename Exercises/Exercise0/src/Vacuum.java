public class Vacuum {
    private String name;
    private String brand;
    private String model;
    private int powerRating;
    private boolean isCorded;
    private boolean hasBag;
    private int dustCapacity;
    private boolean isWetDry;
    //constructor
    public Vacuum(String name, String brand, String model, int powerRating, boolean isCorded, boolean hasBag, int dustCapacity, boolean isWetDry) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.powerRating = powerRating;
        this.isCorded = isCorded;
        this.hasBag = hasBag;
        this.dustCapacity = dustCapacity;
        this.isWetDry = isWetDry;
        System.out.println("Vacuum instance is created with brand:"+brand);
    }
   //method 1
    public void displayInfo(){

    }
    //method 2
    public void printPowerRating(){

    }
    //method 3
    public void printModel(){

    }
}
