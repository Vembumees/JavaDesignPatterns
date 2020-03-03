package Builder.Example5;

public class Gateway {
    public Unit constructUnit(UnitBuilder builder){
        builder.buildHitPoints();
        builder.buildArmor();
        builder.buildDamage();
        return builder.getUnit();
    }
}
