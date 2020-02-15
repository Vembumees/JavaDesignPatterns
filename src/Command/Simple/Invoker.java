package Command.Simple;

public class Invoker {
    ICommand commandToBePerformed;

    //Alternative approach:
    //You can also initialize the invoker with a command object
    /*public Invoker(Command command)
    {
        this.commandToBePerformed = command;
    }*/

    public void setcommand(ICommand command)
    {
        this.commandToBePerformed = command;
    }

    public void invokeCommand()
    {
        commandToBePerformed.executeCommand();
    }
}
