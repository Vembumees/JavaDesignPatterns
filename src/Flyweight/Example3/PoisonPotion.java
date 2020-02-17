package Flyweight.Example3;

public class PoisonPotion implements IPotion {
    @Override
    public void drink() {
        System.out.println("You are poisoned.");
    }
}
