package Builder.Modified;

public class Main {
    public static void main(String[] args) {

        System.out.println("MODIFIED BUILDER PATTERN DEMO\n");
        /*
        making a custom car(through builder)
        step1: get a builder object with required parameters
        step2:setter like methods are used, they will set the optional fields also.
        step3:Invoke the constructCar() method to get the final car
         */

        final ProductClass customCar1 = new CarBuilder()
                .addHeadlights(5)
                .insertWheels(5)
                .buildBody("Plastic")
                .constructCar();
        System.out.println(customCar1);
        System.out.println("------------");
        /*making another custom car (through builder) with a different sequence and steps*/
        ModifiedBuilder carBuilder2 = new CarBuilder();
        final ProductClass customCar2 = carBuilder2
                .insertWheels(7)
                .addHeadlights(6)
                .startUpOperations("I'm making my own car")
                .constructCar();
        System.out.println(customCar2);
        System.out.println("-------------------");

        //verifying the getConstructedCar() method
        final ProductClass customCar3 = carBuilder2.getConstructedCar();
        System.out.println(customCar3);

    }
}
