package FactoryMethod.AbstractFactory;

public class PetTiger implements Tiger{
    @Override
    public void speak() {
        System.out.println("Pet tiger says softly meeooooow");
    }

    @Override
    public void preferredAction() {
        System.out.println("Pet tigers play in the animal circus \n");
    }
}
