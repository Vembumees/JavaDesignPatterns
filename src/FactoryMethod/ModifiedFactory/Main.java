package FactoryMethod.ModifiedFactory;


public class Main {
    public static void main(String[] args) {
        System.out.println("MODIFIED FACTORY");
        AnimalFactory tigerFactory = new TigerFactory();
        Animal aTiger = tigerFactory.makeAnimal();

        AnimalFactory dogFactory = new DogFactory();
        Animal aDog = dogFactory.makeAnimal();

    }
}
