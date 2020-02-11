package FactoryMethod.ModifiedFactory;


public class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Auh auh");
    }

    @Override
    public void preferredAction() {
        System.out.println("Dogs prefer barking....\n");
    }
}
