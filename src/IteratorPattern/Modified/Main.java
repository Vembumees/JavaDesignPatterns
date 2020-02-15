package IteratorPattern.Modified;

public class Main {

    public static void main(String[] args) {
        System.out.println("MODIFIED ITERATOR");
        IDatabase employeesList = new EmployeeDatabase();
        EmployeeIterator iteratorForEmployee = employeesList.createIterator();
        System.out.println("\n --------Employee details are as follows--------\n");
        while(iteratorForEmployee.hasNext())
        {
            System.out.println(iteratorForEmployee.next());
        }
    }
}
