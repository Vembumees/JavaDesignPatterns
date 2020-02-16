package Bridge.Example2;

public interface Weapon {
    void wield();
    void swing();
    void unwield();

    Enchantment getEnchantment();
}
