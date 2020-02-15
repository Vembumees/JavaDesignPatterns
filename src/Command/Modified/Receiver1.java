package Command.Modified;

public class Receiver1 implements IReceiver {
    private int myNumber;

    public int getMyNumber()
    {
        return myNumber;
    }

    public void setMyNumber(int myNumber)
    {
        this.myNumber = myNumber;
    }

    public Receiver1()
    {
        myNumber = 10;
        System.out.println("Receiver1 initialized with " + myNumber);
        System.out.println("The objects of receiver1 cannot be set beyond " + myNumber);
    }

    @Override
    public void performUnDo() {
        System.out.println("Received an undo addition request.");
        int presentNumber = this.myNumber;

        if (presentNumber > 10)
        {
            setMyNumber(this.myNumber - 2);
            System.out.println(presentNumber + " - 2 = " + this.myNumber);
            System.out.println("\t Undo request processed.");
        }
        else
        {
            System.out.println("Nothing more to undo...");
        }
    }

    @Override
    public void performDo() {

        System.out.println("Received an addition request.");
        int presentNumber = getMyNumber();
        setMyNumber(presentNumber + 2);
        System.out.println(presentNumber + " + 2 ="+ this.myNumber);
    }
}
