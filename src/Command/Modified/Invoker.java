package Command.Modified;

public class Invoker {
    ICommand commandToBePerformed;
    public void setCommand(ICommand command)
    {
        this.commandToBePerformed = command;
    }

    public void executeCommand()
    {
        commandToBePerformed.executeDo();
    }

    public void unDoCommand()
    {
        commandToBePerformed.executeUnDo();
    }
}
