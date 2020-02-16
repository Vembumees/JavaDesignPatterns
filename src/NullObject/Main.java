package NullObject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("NULL OBJECT PATTERN");
        String input = "dummyInput";
        int totalObjects = 0;
        Scanner scanner;
        while(!input.toLowerCase().contains("exit"))
        {
            System.out.println("Enter your choice(Type 'a' for Bus, 'b' for Train. Type 'exit' to close)");
            scanner = new Scanner(System.in);
            if (scanner.hasNextLine())
            {
                input = scanner.nextLine();
            }
            IVehicle vehicle = null;
            switch(input.toLowerCase())
            {
                case "a":
                    vehicle = new Bus();
                    break;
                case "b":
                    vehicle = new Train();
                    break;
                case "exit":
                    System.out.println("Closing the application");
                    vehicle = NullVehicle.getInstance();
                    break;
                default:
                    System.out.println("Invalid input");
                    vehicle = NullVehicle.getInstance();
            }
            totalObjects = Bus.busCount + Train.trainCount + NullVehicle.nullVehicleCount;
            vehicle.travel();
            System.out.println("Total number of objects created in the system is : " + totalObjects);
        }
    }
}
