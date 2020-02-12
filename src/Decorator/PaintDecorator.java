package Decorator;

public class PaintDecorator extends  AbstractDecorator{
    public void makeHouse()
    {
        super.makeHouse();
        //decorating now
        System.out.println("PAINT DECORATOR IS IN ACTION NOW");
        paintTheHouse();
                //add additiona lstuff you need here
    }

    private void paintTheHouse()
    {
        System.out.println("Now I am painting the house");
    }
}
