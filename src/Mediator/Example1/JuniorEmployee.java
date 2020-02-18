package Mediator.Example1;

public class JuniorEmployee extends Employee {
    public JuniorEmployee(IMediator mediator, String name)
    {
        super(mediator);
        this.name = name;
    }

    @Override
    public String employeeType()
    {
        return "JuniorEmployee";
    }
}
