package Builder.Example5;

public abstract class Unit {
    protected int hitPoints;
    protected int armor;
    protected int damage;

    public int getHitPoints(){
        return hitPoints;
    }

    public void setHitPoints(int i){
        this.hitPoints = hitPoints;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
