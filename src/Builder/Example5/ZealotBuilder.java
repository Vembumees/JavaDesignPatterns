package Builder.Example5;

public class ZealotBuilder implements UnitBuilder {

    private Unit unit;
    public ZealotBuilder(){
        unit = new Zealot();
    }

    @Override
    public void buildHitPoints() {
        unit.setHitPoints(100);
    }

    @Override
    public void buildArmor() {
        unit.setArmor(50);
    }

    @Override
    public void buildDamage() {
        unit.setDamage(8);
    }

    @Override
    public Unit getUnit() {
        return unit;
    }
}
