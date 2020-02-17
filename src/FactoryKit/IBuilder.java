package FactoryKit;

import java.util.function.Supplier;

public interface IBuilder {
    void add(EWeaponType name, Supplier<IWeapon> supplier);
}
