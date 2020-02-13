package FactoryMethod.AbstractFactory;

public class WildAnimalFactory implements IAnimalFactory {


    @Override
    public Dog createDog() {
        return new WildDog();
    }

    @Override
    public Tiger createTiger() {
        return new WildTiger();
    }
}
