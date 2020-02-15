package Command.Modified;

public class PowerCommand implements ICommand {
    private IReceiver receiver;

    public PowerCommand(IReceiver receiver)
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
