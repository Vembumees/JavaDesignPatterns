package Bridge.Example2;

public class Hammer implements Weapon {

    private final Enchantment enchantment;

    public Hammer(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        enchantment.onActivate();
    }

    @Override
    public void swing() {
        enchantment.Use();
    }

    @Override
    public void unwield() {
        enchantment.onDeactivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
