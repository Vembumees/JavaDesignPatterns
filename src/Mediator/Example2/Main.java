package Mediator.Example2;

public class Main {
    public static void main(String[] args) {
        var party = new PartyImpl();
        var warrior = new Warrior();
        var wizard = new Wizard();
        var huntard = new Hunter();
        var rouge = new Rogue();

        party.addMember(warrior);
        party.addMember(wizard);
        party.addMember(huntard);
        party.addMember(rouge);

        warrior.act(EAction.ENEMY);
        wizard.act(EAction.TALE);
        huntard.act(EAction.HUNT);
        rouge.act(EAction.GOLD);

    }
}
