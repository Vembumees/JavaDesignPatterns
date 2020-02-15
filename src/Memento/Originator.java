package Memento;

public class Originator {
    private int stateId;

    public Originator()
    {
        this.stateId = 0;
        System.out.println(" Originator is created with state id :" + stateId);
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId)
    {
        System.out.println(" Setting the state id of the originator to: " + stateId);
        this.stateId = stateId;
    }

    public Memento saveMemento(int stateId)
    {
        System.out.println(" Saving originator's current state id. ");
        return new Memento(stateId);
    }

    //Restoring to a previous state from a (mememto)
    public void revertMemento(Memento previousMemento)
    {
        System.out.println(" Restoring to state id..." + previousMemento.getStateId());
        this.stateId = previousMemento.getStateId();
        System.out.println(" Current state id of originator : " + stateId);
    }
}
