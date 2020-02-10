package Singleton.EagerInit;

public class Captain {

    //early initialization

    private static final Captain captain = new Captain();

    private Captain()
    {
        System.out.println("A captain is elected for your team.");
    }

    /*Global point of access. the method getcaptain is public static method*/
    public static Captain getCaptain()
    {
        System.out.println("You have a captain for your team.");
        return captain;
    }

    public static void dummyMethod()
    {
        System.out.println("activate dummyMethod()");
    }
}
