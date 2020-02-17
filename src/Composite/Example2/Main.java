package Composite.Example2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Message from the orcs:");

        var orcMessage = new Messenger().messageFromOrcs();
        orcMessage.print();

        System.out.println("Message from the elves:");
        var elfMessage = new Messenger().messageFromElves();
        elfMessage.print();
    }
}
