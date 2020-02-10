package Singleton.standard;

public final class Captain
{
    private static Captain captain;

    //make constructor private to prevent the use of "new"
    private Captain(){}

    static int numberOfInstances = 0;

    public static synchronized Captain getCaptain()
    {
        //lazy initialization (create object only when its required)
        if (captain == null)
        {
            numberOfInstances++;
            captain = new Captain();
            System.out.println("New captain is elected for your team.");
        }
        else
        {
            System.out.println("Can't create a captain. You already have a captain for your team.");
        }
        return captain;
    }
}

// we can't extend captain class, constructor is private in this case
