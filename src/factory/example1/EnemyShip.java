package factory.example1;

public abstract class EnemyShip{
    private String name;
    private double amtDamage;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public double getDamage(){
        return amtDamage;
    }

    public void setDamage(double newDamage){
        amtDamage = newDamage;
    }

    public void followHeroShip(){
        System.out.println(getName() + " is following the hero.");
    }

    public void DisplayEnemyShip(){
        System.out.println(getName() + " is on the screen.");
    }

    public void EnemyShipShoots(){
        System.out.println(getName() + " attacks and deals " + getDamage() + " damage." );
    }
 }