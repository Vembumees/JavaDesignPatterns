package FactoryMethod.Example4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ElfBlacksmith implements IBlacksmith {

    private static Map<EWeaponType, ElfWeapon> ELFARSENAL;

    static {
        ELFARSENAL = new HashMap<>(EWeaponType.values().length);
        Arrays.stream(EWeaponType.values()).forEach(type -> ELFARSENAL.put(type, new ElfWeapon(type)));
    }

    @Override
    public IWeapon manufactureWeapon(EWeaponType weaponType) {
        return ELFARSENAL.get(weaponType);
    }
}
