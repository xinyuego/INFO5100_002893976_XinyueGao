public class SportsEquipment {
    private String name;
    private String sport;
    private double price;
    private int quantity;
    private boolean isAvailable;
    private String uniqueId;
    private String material;
    private String color;
//constructor
    public SportsEquipment(String name, String sport, double price, int quantity, boolean isAvailable, String uniqueId, String material, String color) {
        this.name = name;
        this.sport = sport;
        this.price = price;
        this.quantity = quantity;
        this.isAvailable = isAvailable;
        this.uniqueId = uniqueId;
        this.material = material;
        this.color = color;
        System.out.println("SportsEquipment instance is created with uniqueId: "+uniqueId);
    }
    //method 1
    public void purchase() {
        System.out.println("Purchased " + name + " for " + sport + ".");
    }

    // Method 2
    public void checkAvailability() {
        System.out.println(name + " is " + (isAvailable ? "available" : "not available") + ".");
    }

    // Method 3
    public void displayDetails() {
        System.out.println("Sports Equipment Details:");
        System.out.println("Name: " + name);
        System.out.println("Sport: " + sport);
        System.out.println("Price: $" + price);
        System.out.println("Quantity in stock: " + quantity);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}
