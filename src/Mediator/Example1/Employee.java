package Mediator.Example1;

abstract class Employee {
    protected IMediator mediator;
    protected String name;
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Employee(IMediator mediator)
    {
        this.mediator = mediator;
    }

    public void sendMessage(String msg) throws InterruptedException
    {
        mediator.sendMessage(this, msg);
    }
    public abstract String employeeType();
}
