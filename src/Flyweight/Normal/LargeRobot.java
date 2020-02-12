package Flyweight.Normal;

public class LargeRobot implements Robot {

    /*
     * Intrinsic state.
     * It is not supplied by client.
     * So, it is independent of the flyweight’s context.
     * This can be shared across.
     * These data are often immutable.
     */

    private final String robotTypeCreated;

    public LargeRobot() {
        robotTypeCreated = "A large robot created.";
        System.out.println(robotTypeCreated);
    }

    @Override
    public void showMe(String color) {
        System.out.println(" with " + color + " color");
    }





}
