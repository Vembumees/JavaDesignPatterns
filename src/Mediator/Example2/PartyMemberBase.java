package Mediator.Example2;

public abstract class PartyMemberBase implements IPartyMember {

    protected IParty party;

    @Override
    public void joinedParty(IParty party){
        System.out.println(this.getClass() + " joins the party");
        this.party = party;
    }

    @Override
    public void partyAction(EAction action){
        System.out.println(this.getClass() + " " + action.getDescription());
    }

    @Override
    public void act(EAction action){
        if (party != null){
            System.out.println(this.getClass() + " " + action);
            party.act(this, action);
        }
    }

    @Override
    public abstract String toString();
}
