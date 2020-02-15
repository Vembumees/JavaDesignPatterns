package Command.Simple;

public class Main {
    public static void main(String[] args) {
        System.out.println("COMMAND PATTERN DEMO");
        Receiver intendedReceiver = new Receiver();
        MyUndoCommand undoCmd = new MyUndoCommand(intendedReceiver);
        Invoker invoker = new Invoker();
        invoker.setcommand(undoCmd);
        invoker.invokeCommand();

        MyRedoCommand redoCmd = new MyRedoCommand(intendedReceiver);
        invoker.setcommand(redoCmd);
        invoker.invokeCommand();
    }
}
