package Singleton.DoubleCheckedLocking;

public class Captain {
    private static Captain captain;

    static int numberOfinstance = 0;
    private Captain(){
        numberOfinstance++;
        System.out.println("Number of instances at this moment=" + numberOfinstance);
    }

    public static Captain getCaptain(){
        if (captain == null){
            synchronized (Captain.class){
                //lazy init
                if (captain == null){
                    captain = new Captain();
                    System.out.println("New captain is elected for your team");
                }
                else
                {
                    System.out.println("CAn't get a new captain. YOu already have a captain for your team.");
                }
            }
        }
        return captain;
    }
}
