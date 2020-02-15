package Command.Modified;

public class AdditionCommand implements ICommand {

    private IReceiver receiver;
    public AdditionCommand(IReceiver receiver)
    {
        this.receiver = receiver;
    }

    @Override
    public void executeDo() {
        receiver.performDo();
    }

    @Override
    public void executeUnDo() {
        receiver.performUnDo();
    }
}
