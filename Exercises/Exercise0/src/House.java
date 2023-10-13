public class House {
    private String location;
    private double price;
    private double area;
    private int numberOfBathroom;
    private int numberOfBedroom;
    private int numberOfFloor;
    private int numberOfGarage;
    private boolean schoolDistrict;
//constructor
    public House(String location, double price, double area, int numberOfBathroom, int numberOfBedroom, int numberOfFloor, int numberOfGarage, boolean schoolDistrict) {
        this.location = location;
        this.price = price;
        this.area = area;
        this.numberOfBathroom = numberOfBathroom;
        this.numberOfBedroom = numberOfBedroom;
        this.numberOfFloor = numberOfFloor;
        this.numberOfGarage = numberOfGarage;
        this.schoolDistrict = schoolDistrict;
        System.out.println("House instance is created with location:"+location);
    }
    //method 1
    public void displayInfo(){

    }
    //method 2
    public void printNumberOfFloor(){

    }
    //method 3
    public void printNumberOfBathroom(){

    }
}
