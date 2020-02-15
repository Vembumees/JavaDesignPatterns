package Memento;

public class Main {
    public static void main(String[] args) {
        //caretaker class
        //1.a client (caretaker) can request a memento from the originator to save the
        //internal state of the originator and
        //2.pass a memento back to the originator (to restore to a previous state).
        //This enables to save and restore the internal state of an originator without
        //violating its encapsulation

        Originator originatorObject = new Originator();
        Memento mementoObject;
        originatorObject.setStateId(1);
        mementoObject = originatorObject.saveMemento(originatorObject.getStateId());
        System.out.println("Snapshot #1: Originator's curretn state id is saved in caretaker.");

        //changing the state id of Originator
        originatorObject.setStateId(2);
        mementoObject = originatorObject.saveMemento(originatorObject.getStateId());
        System.out.println("Snapshot #2: Originator's current state id is saved in caretaker");

        originatorObject.setStateId(3);
        originatorObject.revertMemento(mementoObject);
    }
}
