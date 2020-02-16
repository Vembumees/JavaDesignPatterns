package SimpleFactory;

import java.util.Scanner;

public class SimpleFactory {

    public IAnimal createAnimal()
    {
        IAnimal intendedAnimal = null;
        System.out.println("Enter your choice(0 for Dog, 1 for Tiger)");
        @SuppressWarnings("resource")
                Scanner input = new Scanner(System.in);
        int choice = Integer.parseInt(input.nextLine());
        System.out.println("You have entered : " + choice);
        switch(choice)
        {
            case 1:
                intendedAnimal = new Dog();
                break;
            case 2:
                intendedAnimal = new Tiger();
                break;
            default:
                System.out.println("You must enter 1 or 2");
                throw new IllegalArgumentException("Your choice tries to create an unknown animal");
        }
        return intendedAnimal;
    }

}
