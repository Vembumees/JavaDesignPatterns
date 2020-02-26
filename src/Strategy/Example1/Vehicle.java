package Strategy.Example1;

public abstract class Vehicle {
    /*
    A context object contains reference variables for the strategy project's interface type.
     */
    ITransportMedium transportMedium;
    public Vehicle()
    {

    }
    public void showTransportMedium()
    {
            //delegate the task to the corresponding behavior class
            transportMedium.transport();
    }

    public void commonJob()
    {
        System.out.println("We all can be used to transport");
    }

    public abstract void showMe();
}
