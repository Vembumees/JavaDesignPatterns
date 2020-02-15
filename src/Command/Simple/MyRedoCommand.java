package Command.Simple;

public class MyRedoCommand implements ICommand {
    private Receiver receiver;
    public MyRedoCommand(Receiver receiver)
    {
        this.receiver = receiver;
    }


    @Override
    public void executeCommand() {
        receiver.doOptionalTaskPriorToRedo();
        receiver.performRedo();
    }
}
