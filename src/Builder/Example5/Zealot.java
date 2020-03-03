package Builder.Example5;

public class Zealot extends Unit {
    @Override
    public String toString() {
        return "Zealot{" +
                "hitPoints=" + getHitPoints() +
                ", armor=" + getArmor() +
                ", damage=" + getDamage() +
                '}';
    }
}
