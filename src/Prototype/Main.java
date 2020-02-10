package Prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Prototype pattern demo\n");
        BasicCar nano = new Nano("Green Nano");
        nano.basePrice = 10000;

        BasicCar ford = new Ford("Ford Yellow");
        ford.basePrice = 50000;

        BasicCar bc1;
        //Nano
        bc1 = nano.clone();
        //price will be more than 100000 for sure
        bc1.onRoadPrice = nano.basePrice + BasicCar.setAdditionalPrice();
        System.out.println("Car is: " +bc1.modelName+" and it's price is "+bc1.onRoadPrice+"$.");

        //Ford
        bc1 = ford.clone();
        //PRice will be more than 500k for sure
        bc1.onRoadPrice = ford.basePrice+BasicCar.setAdditionalPrice();
        System.out.println("Car is: " +bc1.modelName+" and it's price is "+bc1.onRoadPrice+"$.");

    }
}
