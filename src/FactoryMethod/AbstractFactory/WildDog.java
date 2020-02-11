package FactoryMethod.AbstractFactory;

public class WildDog implements Dog {
    @Override
    public void speak() {
        System.out.println("Wild dog says loudly: Bark bark");
    }

    @Override
    public void preferredAction() {
        System.out.println("Wild dogs prefer to roam freely in the forests\n");
    }
}
