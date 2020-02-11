package FactoryMethod.ModifiedFactory;



public class Tiger implements Animal {

    @Override
    public void speak() {
        System.out.println("Tiger says: Meow");
    }

    @Override
    public void preferredAction() {
        System.out.println("Tigers prefer hunting...\n");
    }
}
