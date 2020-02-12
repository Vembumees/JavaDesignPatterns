package Flyweight.Normal;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {

        RobotFactory robotFactory = new RobotFactory();
        System.out.println("\n FLYWEIGHT PATTERN\n");
        Robot myRobot;
        //Here we are trying to get 3 small type robots
        for (int i = 0; i < 3; i++)
        {
            myRobot = RobotFactory.getRobotFromFactory("small");
            /*
            * Not required to add sleep(). But it is included to increase
            * the probability of getting a new random number to see the
            * variations in the output.
            *  */
            Thread.sleep(1000);
            //The extrinsic property color is supplied by the client code;
            myRobot.showMe(getRandomColor());
        }

        int numOfDistinctRobots = robotFactory.totalObjectsCreated();
        System.out.println("\n Till now, total no of distinct robot objects" +
                "created: " + numOfDistinctRobots);

        //here we are trying to get 5 large type robots
        for (int i = 0; i < 5; i++)
        {
            myRobot = RobotFactory.getRobotFromFactory("large");
            /*Not required to add sleep(). But it is included to
            * increase the probability of getting a new random number
            * to see the variations in the output.*/
            Thread.sleep(1000);
            //The extrinsic property color is supplied by the client code.
            myRobot.showMe(getRandomColor());
        }

        numOfDistinctRobots = robotFactory.totalObjectsCreated();
        System.out.println("\n Till now, total no of distinct robot objects created: " +
                numOfDistinctRobots);

        //Here we are tryng to get 4 fixed sizerobots
        for (int i = 0; i < 4; i++)
        {
            myRobot = RobotFactory.getRobotFromFactory("fixed");
            Thread.sleep(1000);
            myRobot.showMe(getRandomColor());
        }
        numOfDistinctRobots = robotFactory.totalObjectsCreated();
        System.out.println("\n Till now, total no of distinct robot objects created: " + numOfDistinctRobots);
    }

    static String getRandomColor()
    {
        Random r = new Random();
        /*I am simply checking the random number generated that can be
        either an even number or an odd number. And based on that we are choosing
        the color. For simplicity, I am using only two two colors-red
        and green.*/
        int random = r.nextInt();
        if (random % 2 == 0)
        {
            return "red";
        }
        else
        {
            return "green";
        }
    }
}
