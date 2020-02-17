package Flyweight.Example3;

import java.util.List;

public class AlchemistShop {

    private List<IPotion> topShelf;
    private List<IPotion> bottomShelf;

    public AlchemistShop()
    {
        var factory = new PotionFactory();
        topShelf = List.of(
                factory.createPotion(EPotionType.INVISIBILITY),
                factory.createPotion(EPotionType.INVISIBILITY),
                factory.createPotion(EPotionType.STRENGTH),
                factory.createPotion(EPotionType.STRENGTH),
                factory.createPotion(EPotionType.HEALING),
                factory.createPotion(EPotionType.HEALING),
                factory.createPotion(EPotionType.HEALING)

        );

        bottomShelf = List.of(
                factory.createPotion(EPotionType.POISON),
                factory.createPotion(EPotionType.POISON),
                factory.createPotion(EPotionType.HOLY_WATER)
         );
    }

    public final List<IPotion> getTopShelf(){
        return List.copyOf(this.topShelf);
    }

    public final List<IPotion> getBottomShelf(){
        return List.copyOf(this.bottomShelf);
    }

    public void enumerate(){
        System.out.println("Enumerating top shelf potions\n");
        topShelf.forEach(IPotion::drink);
        System.out.println("Enumerating bottom shelf potions\n");
        bottomShelf.forEach(IPotion::drink);
    }

}
