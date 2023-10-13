public class Snack {
    private String name;
    private double price;
    private String dateOfProduction;
    private int calories;
    private double weight;
    private String color;
    private String countryOfOrigin;
    private String shape;
//constructor
    public Snack(String name, double price, String dateOfProduction, int calories, double weight, String color, String countryOfOrigin, String shape) {
        this.name = name;
        this.price = price;
        this.dateOfProduction = dateOfProduction;
        this.calories = calories;
        this.weight = weight;
        this.color = color;
        this.countryOfOrigin = countryOfOrigin;
        this.shape = shape;
        System.out.println("Snack instance is created with name:"+name);
    }
    //method 1
    public void displayInfo(){

    }
    //method 2
    public void printCountryOfOrigin(){

    }
    //method 3
    public void printPrice(){

    }
}
