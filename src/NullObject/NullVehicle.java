package NullObject;

public class NullVehicle implements IVehicle {
    private static NullVehicle instance = new NullVehicle();
    public static int nullVehicleCount;

    private NullVehicle()
    {
        nullVehicleCount++;
        System.out.println(" A null vehicle object created. Currently null vehicle count is : " +nullVehicleCount);
    }

    //global point of access
    public static NullVehicle getInstance()
    {
        return instance;
    }

    @Override
    public void travel() {
        //do nothing
    }
}
