package FactoryMethod.StandardFactory;

public class Main {

    public static void main(String[] args) {
        System.out.println("FACTORY PATTERN DEMO\n");
        //Creating a Tiger Factory
        AnimalFactory tigerFactory = new TigerFactory();
        //creating a tiger using the Factory Method
        Animal aTiger = tigerFactory.createAnimal();
        aTiger.speak();
        aTiger.preferredAction();

        //creating a dogfactory
        AnimalFactory dogFactory = new DogFactory();
        //creating a dog using the factory method
        Animal aDog = dogFactory.createAnimal();
        aDog.speak();
        aDog.preferredAction();
    }
}
