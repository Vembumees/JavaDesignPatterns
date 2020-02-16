package Bridge.Example2;

public class FlyingEnchantment implements Enchantment{

    @Override
    public void onActivate() {
        System.out.println("Item begins to glow faintly.");
    }

    @Override
    public void Use() {
        System.out.println("Item flies and strikes the enemies, finally returning to owner's hand.");
    }

    @Override
    public void onDeactivate() {
        System.out.println("Item glow fades.");
    }
}
