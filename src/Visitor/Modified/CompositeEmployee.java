package Visitor.Modified;

import java.util.ArrayList;
import java.util.List;

public class CompositeEmployee implements  IEmployee {

    private String name;
    private String dept;
    private final int yearsOfExperience;
    private List<IEmployee> controls;

    public CompositeEmployee(String name, String dept, int experience)
    {
        this.name = name;
        this.dept = dept;
        this.yearsOfExperience = experience;
        controls = new ArrayList<IEmployee>();
    }

    public void addEmployee(IEmployee e)
    {
        controls.add(e);
    }

    public void removeEmployee(IEmployee e)
    {
        controls.remove(e);
    }

    public String getName()
    {
        return name;
    }

    public String getDept()
    {
        return dept;
    }

    public int getExperience()
    {
        return yearsOfExperience;
    }

    public List<IEmployee> getControls()
    {
        return this.controls;
    }

    @Override
    public void printStructures() {
        System.out.println("\t" + getName() + " works in " + getDept() + " Experience: " + getExperience() + "years ");
        for (IEmployee e : controls)
        {
            e.printStructures();
        }
    }

    @Override
    public void acceptVisitor(IVisitor visitor) {
        visitor.visitTheElement(this);
    }
}
