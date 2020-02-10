package Singleton.DoubleCheckedLocking;

public class
Main {
    public static void main(String[] args) {
        Captain captain1 = Captain.getCaptain();
        System.out.println("Trying to make another captain for your team:");
        Captain captain2 = Captain.getCaptain();
        if (captain1 == captain2)
        {
            System.out.println("captain1 and captain2 are the same instance.");
        }
    }
}
