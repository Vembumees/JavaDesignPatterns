package Mediator.Example2;

public interface IParty {
    void addMember(IPartyMember member);
    void act(IPartyMember actor, EAction action);
}
