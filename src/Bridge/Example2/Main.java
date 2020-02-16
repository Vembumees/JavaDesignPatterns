package Bridge.Example2;

public class Main {
    public static void main(String[] args) {
        Hammer hammer = new Hammer(new FlyingEnchantment());
        hammer.wield();
        hammer.swing();
        hammer.unwield();
    }

}
