package Flyweight.Example3;

import java.util.EnumMap;
import java.util.Map;

public class PotionFactory {

    private final Map<EPotionType, IPotion> potions;

    public PotionFactory(){
        potions = new EnumMap<>(EPotionType.class);
    }

    IPotion createPotion(EPotionType type){
        var potion = potions.get(type);
        if (potion == null) {
            switch (type) {
                case HEALING:
                    potion = new HealingPotion();
                    potions.put(type, potion);
                    break;
                case INVISIBILITY:
                    potion = new InvisibilityPotion();
                    potions.put(type, potion);
                    break;
                case STRENGTH:
                    potion = new StrengthPotion();
                    potions.put(type, potion);
                    break;
                case HOLY_WATER:
                    potion = new HolyWaterPotion();
                    potions.put(type, potion);
                    break;
                case POISON:
                    potion = new PoisonPotion();
                    potions.put(type, potion);
                    break;
                default:
                    System.out.println("Potionfactory undefined.");
                    break;
            }
        }
        return potion;
    }
}
