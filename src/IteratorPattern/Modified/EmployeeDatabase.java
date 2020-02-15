package IteratorPattern.Modified;

import java.util.LinkedList;

public class EmployeeDatabase implements IDatabase {
    private LinkedList<Employee> employeeList;

    public EmployeeDatabase()
    {
        employeeList = new LinkedList<Employee>();
        employeeList.add(new Employee("Michael", 1, 1235.95));
        employeeList.add(new Employee("Jon", 2, 1400.15));
        employeeList.add(new Employee("Vasja", 3,2.55));
        employeeList.add(new Employee("Blow", 4, 50000.40));
    }

    public EmployeeIterator createIterator() {
        return new EmployeeIterator(employeeList);
    }
}
