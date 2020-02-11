package FactoryMethod.AbstractFactory;

public class PetDog implements Dog {
    @Override
    public void speak() {
        System.out.println("Pet dog says softly Auh Auh");
    }

    @Override
    public void preferredAction() {
        System.out.println("Pet dogs prefer to stay at home\n");
    }
}
