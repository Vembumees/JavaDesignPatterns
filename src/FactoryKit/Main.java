package FactoryKit;

public class Main {
    public static void main(String[] args) {
        var factory = IWeaponFactory.factory(IBuilder -> {
            IBuilder.add(EWeaponType.SWORD, Sword::new);
            IBuilder.add(EWeaponType.AXE, Axe::new);
            IBuilder.add(EWeaponType.SPEAR, Spear::new);
            IBuilder.add(EWeaponType.BOW, Bow::new);
        });
        var axe = factory.create(EWeaponType.AXE);
        System.out.println(axe.toString());
    }
}
