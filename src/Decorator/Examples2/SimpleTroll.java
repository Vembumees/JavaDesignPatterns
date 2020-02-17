package Decorator.Examples2;

public class SimpleTroll implements Troll {

    @Override
    public void attack(){
        System.out.println("Troll tries to grab you");
    }

    @Override
    public int getAttackPower(){
        return 10;
    }

    @Override
    public void fleeBattle()
    {
        System.out.println("The troll shrieks in horror and run away.");
    }
}
