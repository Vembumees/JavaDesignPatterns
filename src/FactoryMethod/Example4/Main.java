package FactoryMethod.Example4;

public class Main {
    private final IBlacksmith blacksmith;

    public Main(IBlacksmith blacksmith)
    {
        this.blacksmith = blacksmith;
    }


    public static void main(String[] args) {

        //lets go to war with orc weapons
        var main = new Main(new OrcBlacksmith());
        main.manufactureWeapons();

        //lets go to war with elf weapons
        main = new Main(new ElfBlacksmith());
        main.manufactureWeapons();

    }

    private void manufactureWeapons(){
        var weapon = blacksmith.manufactureWeapon(EWeaponType.SPEAR);
        System.out.println(weapon.toString());
        weapon = blacksmith.manufactureWeapon(EWeaponType.AXE);
        System.out.println(weapon.toString());
    }
}
