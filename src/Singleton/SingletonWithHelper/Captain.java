package Singleton.SingletonWithHelper;

public class Captain {
    private Captain(){
        System.out.println("A captain is elected for your team.");
    }

    private static class SingletonHelper{
        //nested class is referenced after getcaptain is called

        private static final Captain captain = new Captain();
    }

    public static Captain getCaptain()
    {
        return SingletonHelper.captain;
    }

    public static void dummyMethod()
    {
        System.out.println("This is dummy method");
    }
}
