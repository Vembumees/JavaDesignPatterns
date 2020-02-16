package NullObject;

public class Train implements IVehicle{
    public static int trainCount = 0;
    public Train()
    {
        trainCount++;
    }

    @Override
    public void travel() {
        System.out.println("Let us travel with a train.");
    }
}
