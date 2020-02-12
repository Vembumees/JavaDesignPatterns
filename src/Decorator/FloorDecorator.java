package Decorator;

public class FloorDecorator extends AbstractDecorator {

    public void makeHouse()
   {
        super.makeHouse();
        //decorating now
       System.out.println("FLOOR DECORATOR IS IN ACTION");
       addFloor();
       //you can put additional stuff you need to build here
   }

   private void addFloor()
   {
       System.out.println("I'm making an additional floor on top of it");
   }

}
