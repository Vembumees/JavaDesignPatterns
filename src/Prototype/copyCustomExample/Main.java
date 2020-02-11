package Prototype.copyCustomExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("User defined copy constructor example\n");
        Student student1 = new Student(1, "John");
        System.out.println("Details of student1 is as follows: ");
        student1.displayDetails();
        //Invoking the user defined copy constructor
        Student student2 = new Student (student1);
        System.out.println("The details of Sudent2 is as follows:");
        student2.displayDetails();
    }
}
