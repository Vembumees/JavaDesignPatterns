package Mediator.Example2;

import java.util.ArrayList;
import java.util.List;

public class PartyImpl implements IParty {

    private final List<IPartyMember> members;

    public PartyImpl(){
        members = new ArrayList<>();
    }

    @Override
    public void act(IPartyMember actor, EAction action){
        for (IPartyMember member : members){
            if (!member.equals(actor)){
                member.partyAction(action);
            }
        }
    }

    @Override
    public void addMember(IPartyMember member){
        members.add(member);
        member.joinedParty(this);
    }
}
