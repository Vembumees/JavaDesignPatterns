package Bridge.Example1;

public class OffState implements IState {

    @Override
    public void moveState() {
        System.out.println("Off State\n");
    }

    @Override
    public void hardPressed() {
        System.out.println("\tThe device is Offline now. Do not press the off button again.\n");
    }
}
