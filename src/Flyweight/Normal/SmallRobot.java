package Flyweight.Normal;

public class SmallRobot implements Robot {

    /*
     * Intrinsic state.
     * It is not supplied by client.
     * So, it is independent of the flyweight’s context.
     * This can be shared across.
     * These data are often immutable.
     */

    private final String robotTypeCreated;
    public SmallRobot()
    {
        robotTypeCreated = "A small robot created";
        System.out.println(robotTypeCreated);
    }

    @Override
    public void showMe(String color) {
        System.out.println(" with " +color + " color");
    }
}
