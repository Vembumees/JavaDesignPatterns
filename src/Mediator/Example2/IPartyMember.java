package Mediator.Example2;

public interface IPartyMember {
    void joinedParty(IParty party);
    void partyAction(EAction actions);
    void act(EAction action);
}
