package Prototype.copyCustomExample;

public class Student {

    int rollNo;
    String name;
    //Instance constructor
    public Student(int RollNo, String name)
    {
        this.rollNo = RollNo;
        this.name = name;
    }

    //COpy constructor
    public Student(Student student)
    {
        this.name = student.name;
        this.rollNo = student.rollNo;
    }

    public void displayDetails(){
        System.out.println("Student name: " + name + ", Roll no: " + rollNo);
    }

}
