public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Dell", "XPS 13", 13.3, 16, 512, "Intel Core i7", true, "L001");
        Laptop laptop2 = new Laptop("HP", "Spectre x360", 15.6, 8, 256, "Intel Core i5", true, "L002");
        Laptop laptop3 = new Laptop("Lenovo", "ThinkPad X1 Carbon", 14.0, 32, 1_024, "Intel Core i9", false, "L003");
        laptop1.powerOn();
        laptop2.displayInfo();
        laptop3.shutDown();
        System.out.println("==============================");
        City city1 = new City("New York", "USA", 8398748, 468.9, "Bill de Blasio", "NY001",25000,"temperate continental climate");
        City city2 = new City("Paris", "France", 2148271, 105.4, "Anne Hidalgo", "FR001",65000,"temperate continental climate");
        City city3 = new City("Tokyo", "Japan", 13929286, 2187.66, "Yuriko Koike", "JP001",45000,"temperate continental climate");

        // Demonstrate class methods
        city1.displayInfo();
        city2.updatePopulation(2160928);
        city3.changeMayor("Fumiko Hayashi");
        System.out.println("==============================");
        SportsEquipment equipment1 = new SportsEquipment("Soccer Ball", "Soccer", 19.99, 20, true, "001","rubber","black and white");
        SportsEquipment equipment2 = new SportsEquipment("Basketball", "Basketball", 24.99, 15, true, "002","rubber","brown");
        SportsEquipment equipment3 = new SportsEquipment("Tennis Racket", "Tennis", 49.99, 10, false, "003","carbon fiber","white");
        equipment1.purchase();
        equipment2.checkAvailability();
        equipment3.displayDetails();
        System.out.println("==============================");
        Dog dog1= new Dog("Friday","Shiba Inu","10/16/2022","red","Japan","climbing","Xindy","$3800");
        Dog dog2= new Dog("Yuki","Husky","02/06/2021","black and white","Russia","eating","CC","$2500");
        Dog dog3= new Dog("Sunday","Chihuahua","06/30/2019","brown","Mexico","sleeping","George","$2200");
        System.out.println("==============================");
        Phone phone1 = new Phone("Samsung Galaxy S21", "Samsung", "Galaxy S21", "Android", 6.2, 4000, true, 999.99);
        Phone phone2 = new Phone("iPhone 13", "Apple", "iPhone 13", "iOS", 6.1, 3687, true, 1099.99);
        Phone phone3 = new Phone("Google Pixel 6", "Google", "Pixel 6", "Android", 6.4, 4100, true, 899.99);
        System.out.println("==============================");
        Vacuum vacuum1 = new Vacuum("Vacuum Cleaner X", "BrandX", "ModelA", 1200, true, false, 5, true);
        Vacuum vacuum2 = new Vacuum("PowerSweeper Pro", "BrandY", "ModelB", 1500, false, true, 4, false);
        Vacuum vacuum3 = new Vacuum("Wet/Dry Master", "BrandZ", "ModelC", 1800, true, true, 10, true);
        System.out.println("==============================");
        House house1 = new House("123 Main St", 250000, 2000, 2, 3, 2, 1, true);
        House house2 = new House("456 Elm St", 320000, 2400, 2, 4, 2, 2, false);
        House house3 = new House("789 Oak St", 180000, 1600, 1, 2, 1, 0, true);
        System.out.println("==============================");
        Movie movie1 = new Movie("Inception", 12.99, "July 16, 2010", "Leonardo DiCaprio, Joseph Gordon-Levitt", "Christopher Nolan", "Science Fiction", "USA", 8.8, "M123456");
        Movie movie2 = new Movie("The Shawshank Redemption", 9.99, "September 23, 1994", "Tim Robbins, Morgan Freeman", "Frank Darabont", "Drama", "USA", 9.3, "M789012");
        Movie movie3 = new Movie("Jurassic Park", 15.99, "June 11, 1993", "Sam Neill, Laura Dern", "Steven Spielberg", "Action-Adventure", "USA", 8.1, "M345678");
        System.out.println("==============================");
        Pillow pillow1 = new Pillow(29.99, "Cotton", "Square", "White", "18x18", 2.5, 6, "Feather");
        Pillow pillow2 = new Pillow(19.99, "Polyester", "Rectangle", "Blue", "20x12", 1.8, 5, "Synthetic");
        Pillow pillow3 = new Pillow(34.99, "Silk", "Round", "Red", "16 inches", 3.2, 7, "Memory Foam");
        System.out.println("==============================");
        Snack snack1 = new Snack("Potato Chips", 2.99, "August 12, 2023", 150, 150, "Golden", "USA", "Crunchy");
        Snack snack2 = new Snack("Chocolate Bar", 1.99, "July 28, 2023", 220, 100, "Brown", "Switzerland", "Rectangular");
        Snack snack3 = new Snack("Gummy Bears", 0.99, "September 5, 2023", 120, 75, "Multicolored", "Germany", "Bear-shaped");

    }
}