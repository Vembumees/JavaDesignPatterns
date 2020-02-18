package Mediator.Example1;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("MEDIATOR DEMO");
        ConcreteMediator mediator = new ConcreteMediator();

        JuniorEmployee jim = new JuniorEmployee(mediator, "Jim");
        JuniorEmployee jack = new JuniorEmployee(mediator, "Jack");
        SeniorEmployee daniel = new SeniorEmployee(mediator, "Daniel");

        mediator.register(jim);
        mediator.register(jack);
        mediator.register(daniel);
        mediator.displayRegisteredEmployees();

        System.out.println("Communication starts among participants...");
        jim.sendMessage("You have some updog?");
        jack.sendMessage("What's updog?");
        jim.sendMessage("Nothing much, you?");
        daniel.sendMessage("LOL");
        daniel.sendMessage("Get back to work! Time is money!");

        SeniorEmployee.Unknown unknown = new SeniorEmployee.Unknown(mediator, "Michael");
        unknown.sendMessage("Hey guys, Michael here.");

    }
}
