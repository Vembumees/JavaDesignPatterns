package Visitor.Modified;

public class SimpleEmployee implements IEmployee
{
    private String name;
    private String dept;
    private int yearsOfExperience;

    public SimpleEmployee(String name, String dept, int experience)
    {
        this.name = name;
        this.dept = dept;
        this.yearsOfExperience = experience;
    }

    public String getName()
    {
        return name;
    }

    public String getDept()
    {
        return this.dept;
    }

    public int getExperience()
    {
        return yearsOfExperience;
    }

    @Override
    public void printStructures() {
        System.out.println("\t\t" + getName() + " works in " + getDept() + " Experience :" + getExperience() + " years");
    }

    @Override
    public void acceptVisitor(IVisitor visitor) {
        visitor.visitTheElement(this);
    }
}
