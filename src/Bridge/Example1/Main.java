package Bridge.Example1;

public class Main {

    public static void main(String[] args) {
        System.out.println("BRIDGE PATTERN DEMO");
        System.out.println("\n Dealing with a tv at present.");

        IState presentState = new OnState();
        //ElectronicGoods eItem = new Television(presentState);
        ElectronicGoods eItem = new Television();
        eItem.setState(presentState);
        eItem.moveToCurrentState();
        //hard press
        eItem.hardButtonPressed();
        //verifying off state of the television now
        presentState = new OffState();
        //eItem = new Television(presentState);
        eItem.setState(presentState);
        eItem.moveToCurrentState();

        System.out.println("\n Dealing with a DVD now.");
        presentState = new OnState();
        //eItem = new DVD(presentState);
        eItem = new DVD();
        eItem.setState(presentState);
        eItem.moveToCurrentState();

        presentState = new OffState();
        eItem = new DVD();
        eItem.setState(presentState);
        eItem.moveToCurrentState();

        //hard press-A DVD specific method
        ((DVD)eItem).doublePress();

    }
}
