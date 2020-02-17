package Facade.Example3;

public class Main {
    public static void main(String[] args) {
        var facade = new DwarvenGoldmineFacade();
        facade.startNewDay();
        facade.digOutGold();
        facade.endDay();
    }
}
