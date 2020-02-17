package Flyweight.Example3;

public class HealingPotion implements IPotion {
    @Override
    public void drink() {
        System.out.println("You feel healed.");
    }
}
