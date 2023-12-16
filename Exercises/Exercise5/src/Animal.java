abstract class Animal {
    public abstract String makeSound();
}

class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Bark";
    }
}

class Cat extends Animal {
    @Override
    public String makeSound() {
        return "Meow";
    }
}

class AnimalFactory {
    public static Animal getAnimal(String type) {
        if ("dog".equalsIgnoreCase(type)) {
            return new Dog();
        } else if ("cat".equalsIgnoreCase(type)) {
            return new Cat();
        }
        return null;
    }
}

