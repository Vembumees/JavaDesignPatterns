package FactoryMethod.Example4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OrcBlacksmith implements IBlacksmith {
    private static Map<EWeaponType, OrcWeapon> ORCARSENAL;

    static {
        ORCARSENAL = new HashMap<>(EWeaponType.values().length);
        Arrays.stream(EWeaponType.values()).forEach(type -> ORCARSENAL.put(type, new OrcWeapon(type)));
    }

    @Override
    public IWeapon manufactureWeapon(EWeaponType weaponType) {
        return ORCARSENAL.get(weaponType);
    }
}
