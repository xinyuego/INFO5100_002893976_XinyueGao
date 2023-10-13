public class Dog {
    private String name;
    private String breeds;
    private String birthOfDate;
    private String color;
    private String countryOfOrigin;
    private String hobbies;
    private String owner;
    private String price;
//constructor
    public Dog(String name, String breeds, String birthOfDate, String color, String countryOfOrigin, String hobbies, String owner, String price) {
        this.name = name;
        this.breeds = breeds;
        this.birthOfDate = birthOfDate;
        this.color = color;
        this.countryOfOrigin = countryOfOrigin;
        this.hobbies = hobbies;
        this.owner = owner;
        this.price = price;
        System.out.println("Dog instance created with breeds:"+breeds);
    }
    //method 1
    public void displayInfo(){

    }
    //method 2
    public void printOwner(){

    }
    //method 3
    public void printPrice(){

    }

}
