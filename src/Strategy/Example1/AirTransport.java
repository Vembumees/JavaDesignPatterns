package Strategy.Example1;

public class AirTransport implements ITransportMedium {
    @Override
    public void transport() {
        System.out.println("I am transporting in air");
    }
}
