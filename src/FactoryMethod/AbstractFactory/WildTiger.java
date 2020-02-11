package FactoryMethod.AbstractFactory;

public class WildTiger implements Tiger{
    @Override
    public void speak() {
        System.out.println("Wild tiger says loudly: meow");
    }

    @Override
    public void preferredAction() {
        System.out.println("Wild tigers prefer hunting in jungles\n");
    }
}
