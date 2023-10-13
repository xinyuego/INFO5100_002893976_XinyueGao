public class Phone {
    private String name;
    private String brand;
    private String model;
    private String operatingSystem;
    private double screenSize;
    private int batteryCapacity;
    private boolean isSmartphone;
    private double price;

    public Phone(String name, String brand, String model, String operatingSystem, double screenSize, int batteryCapacity, boolean isSmartphone, double price) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
        this.isSmartphone = isSmartphone;
        this.price = price;
        System.out.println("Phone instance is created by name:"+name);
         class Battery {
            private String type;
            private int capacity;

            public Battery() {
                this.type = "Lithium-ion";
                this.capacity = 3000;
            }

            public void charge() {
                // Method to charge the phone's battery
            }

            public void checkStatus() {
                // Method to check battery status
            }
        }
         class Screen {
            private double size;
            private String resolution;

            public Screen() {
                this.size = 6.0;
                this.resolution = "1920x1080";
            }

            public void displayText(String text) {
                // Method to display text on the screen
            }

            public void adjustBrightness(int level) {
                // Method to adjust screen brightness
            }
        }
    }

}

