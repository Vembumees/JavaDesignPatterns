package Command.Simple;

public class Receiver {
    public void performUndo()
    {
        System.out.println("Performing an undo command in Receiver.");
    }

    public void performRedo()
    {
        System.out.println("Performing a redo command in Receiver.");
    }

    public void doOptionalTaskPriorToUndo()
    {
        System.out.println("Executing optional Tasks prior to execute undo command");
    }

    public void doOptionalTaskPriorToRedo()
    {
        System.out.println("Executing optional tasks prior to execute redo command");
    }
}
