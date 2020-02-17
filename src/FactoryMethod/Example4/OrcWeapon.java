package FactoryMethod.Example4;

public class OrcWeapon implements IWeapon{
    private EWeaponType weaponType;

    public OrcWeapon(EWeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "Orcish " + weaponType;
    }

    @Override
    public EWeaponType getWeaponType() {
        return weaponType;
    }
}
