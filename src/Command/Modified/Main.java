package Command.Modified;

public class Main {
    public static void main(String[] args) {
        System.out.println("COMMAND PATTERN with undo supported operations");

        System.out.println("---testing operations in receiver1");
        IReceiver intendedReceiver = new Receiver1();
        ICommand currentCmd = new AdditionCommand(intendedReceiver);

        Invoker invoker = new Invoker();
        invoker.setCommand(currentCmd);
        System.out.println("Testing single do/undo operation");
        invoker.executeCommand();
        invoker.unDoCommand();
        System.out.println("_______");
        System.out.println("Testing a series of do/undo operations");
        invoker.executeCommand();
        invoker.executeCommand();
        invoker.unDoCommand();
        invoker.executeCommand();
        invoker.unDoCommand();
        invoker.unDoCommand();

        intendedReceiver = new Receiver2();
        currentCmd = new PowerCommand(intendedReceiver);
        invoker.setCommand(currentCmd);

        //testing single do/undo operation
        invoker.executeCommand();
        invoker.unDoCommand();
        System.out.println("________");
        //testing a series of operations
        invoker.executeCommand();
        invoker.executeCommand();
        invoker.unDoCommand();
        invoker.executeCommand();
        invoker.unDoCommand();
        invoker.unDoCommand();
        invoker.unDoCommand();
    }
}
