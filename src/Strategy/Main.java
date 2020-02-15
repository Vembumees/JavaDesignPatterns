package Strategy;

public class Main {

    public static void main(String[] args) {
        System.out.println("STRATEGY PATTERN DEMO");
        Vehicle vehicleContext = new Boat();
        vehicleContext.showMe();
        vehicleContext.showTransportMedium();
        System.out.println("_____________");
        vehicleContext = new Aeroplane();
        vehicleContext.showMe();
        vehicleContext.showTransportMedium();
    }
}
