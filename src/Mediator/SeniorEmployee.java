package Mediator;

public class SeniorEmployee extends Employee {
    public SeniorEmployee(IMediator mediator, String name)
    {
        super(mediator);
        this.name = name;
    }

    @Override
    public String employeeType()
    {
        return "SeniorEmployee";
    }

    static class Unknown extends Employee
    {
        public Unknown(IMediator mediator, String name)
        {
            super(mediator);
            this.name = name;
        }
        @Override
        public String employeeType()
        {
            return "Outsider";
        }
    }
}
