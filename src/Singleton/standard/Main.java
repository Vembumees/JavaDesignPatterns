package Singleton.standard;


import static Singleton.standard.Captain.numberOfInstances;

public class Main
{
    public static void main(String[] args) {
        System.out.println("Singleton pattern demo\n");
        System.out.println("Tryign to make a captain for your team");
        //constructor is private, can't use new
        //Captain capt = new Captain(); //error

        Captain captain1 = Captain.getCaptain();
        System.out.println("Trying to make another captain for your team:");
        Captain captain2 = Captain.getCaptain();
        if (captain1 == captain2)
        {
            System.out.println("Captain 1 and captain2 are the same instance.");
        }


        //to check whether this works
        System.out.println("Number of current captains is " + numberOfInstances);

    }
}