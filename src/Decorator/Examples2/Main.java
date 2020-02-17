package Decorator.Examples2;

public class Main {
    public static void main(String[] args) {
        System.out.println("A simple looking troll approached.");
        var troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();
        System.out.println("Simple troll power is" + troll.getAttackPower());


        System.out.println("A troll with a huge club surprises you.");
        var clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack();
        clubbedTroll.fleeBattle();
        System.out.println("Clubbed troll power is " + clubbedTroll.getAttackPower());
    }
}
