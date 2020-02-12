package Decorator;

public class Main {

    public static void main(String[] args) {
        System.out.println("DECORATOR PATTERN DEMO");
        ConcreteComponent withoutDecorator = new ConcreteComponent();
        withoutDecorator.makeHouse();
        System.out.println("_____________");
        //using a decorator to add floor
        System.out.println("Using a floor decorator now");
        FloorDecorator floorDecorator = new FloorDecorator();
        floorDecorator.setTheComponent(withoutDecorator);
        floorDecorator.makeHouse();
        System.out.println("_______________");
        //using a decorator to add floor to original house and then paint it
        System.out.println("Using paint decorator now");
        PaintDecorator paintDecorator = new PaintDecorator();
        //adding results from floor decorator
        paintDecorator.setTheComponent(floorDecorator);
        paintDecorator.makeHouse();
        System.out.println("_________");
    }
}
