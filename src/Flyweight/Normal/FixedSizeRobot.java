package Flyweight.Normal;

public class FixedSizeRobot implements Robot {

    /*
     * Intrinsic state.
     * It is not supplied by client.
     * So, it is independent of the flyweight’s context.
     * This can be shared acorss.
     */
    private final String robotTypeCreated;
    public FixedSizeRobot()
    {
        robotTypeCreated = "A robot with a fixed size created";
        System.out.println(robotTypeCreated);
    }

    @Override
    public void showMe(String color) {
        //ignoring the extrinsic state argument, since it is an unshared flyweight
        System.out.println(" with " + " blue (default) color");
    }
}
