package Flyweight.Example3;

public class InvisibilityPotion implements IPotion {
    @Override
    public void drink() {
        System.out.println("You are invisible;");
    }
}
