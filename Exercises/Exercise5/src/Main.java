public class Main {
    public static void main(String[] args) {
        // Singleton usage
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();

        // Observer usage
        NotificationService service = new NotificationService();
        service.addObserver(new User("George"));
        service.addObserver(new User("Hannah"));
        service.notifyObservers("Merry Christmas!");

        // Factory Method usage
        Animal animal1 = AnimalFactory.getAnimal("dog");
        System.out.println("Animal 1: " + animal1.makeSound());
        Animal animal2 = AnimalFactory.getAnimal("cat");
        System.out.println("Animal 2: " + animal2.makeSound());
    }
}
