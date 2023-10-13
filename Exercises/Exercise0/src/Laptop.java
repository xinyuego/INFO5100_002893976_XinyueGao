public class Laptop {
    private String brand;
    private String model;
    private double screenSize;
    private int memoryRAM;
    private int storageCapacity;
    private String processor;
    private boolean isTouchscreen;
    private String uniqueId;
//constructor
    public Laptop(String brand, String model, double screenSize, int memoryRAM, int storageCapacity, String processor, boolean isTouchscreen, String uniqueId) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.memoryRAM = memoryRAM;
        this.storageCapacity = storageCapacity;
        this.processor = processor;
        this.isTouchscreen = isTouchscreen;
        this.uniqueId = uniqueId;
        System.out.println("Laptop instance is created with brand:"+brand);
    }
    //method 1
    public void powerOn() {
        System.out.println("Powering on " + brand + " " + model + "...");
    }
    //method 2
    public void displayInfo() {
        System.out.println("Laptop Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Screen Size (inches): " + screenSize);
        System.out.println("RAM (GB): " + memoryRAM);
        System.out.println("Storage (GB): " + storageCapacity);
        System.out.println("Processor: " + processor);
        System.out.println("Touchscreen: " + (isTouchscreen ? "Yes" : "No"));
    }
    //method 3
    public void shutDown() {
        System.out.println("Shutting down " + brand + " " + model + "...");
    }
}
