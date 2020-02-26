package Strategy.Example1;

public class WaterTransport implements ITransportMedium
{

    @Override
    public void transport() {
        System.out.println("I am transporting in water.");
    }
}
