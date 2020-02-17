package FactoryKit;

import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

public interface IWeaponFactory {

    IWeapon create(EWeaponType name);

    static IWeaponFactory factory(Consumer<IBuilder> consumer)
    {
        var map = new HashMap<EWeaponType, Supplier<IWeapon>>();
        consumer.accept(map::put);
        return name -> map.get(name).get();
    };
}
