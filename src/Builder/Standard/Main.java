package Builder.Standard;

public class Main {

    public static void main(String[] args) {
        System.out.println("Builder pattern demo\n");
        Director director = new Director();

        Builder fordCar = new Car("Ford");
        Builder hondaMotorcycle = new MotorCycle("Honda");


        //making car
        director.construct(fordCar);
        Product p1 = fordCar.getVehicle();
        p1.showProduct();

        //making motorcycle
        director.construct(hondaMotorcycle);
        Product p2 = hondaMotorcycle.getVehicle();
        p2.showProduct();
    }
}
