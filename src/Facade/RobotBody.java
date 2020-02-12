package Facade;

public class RobotBody {


    public static void createRobot()
    {
        System.out.println("refer the manual before creation of a robot");
    }

    public void createHands()
    {
        System.out.println("Hands manufactured");
    }

    public void createRemainingParts()
    {
        System.out.println("Remaining parts are created");
    }

    public static void destroyRobot()
    {
        System.out.println("Refer the manual before destroying of a robot.");
    }

    public void destroyHands()
    {
        System.out.println("The robot's hands are destroyed.");
    }

    public void destroyRemaingParts()
    {
        System.out.println("the robot's remaining parts are destroyed.");
    }
}
