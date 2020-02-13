package Composite;

public class Main {
    /**Principal is on top of college.
     *HOD -Maths and Comp. Sc directly reports to him
     *Teachers of Computer Sc. directly reports to HOD-CSE
     *Teachers of Mathematics directly reports to HOD-Maths
     */
    public static void main(String[] args) {
        System.out.println("COMPOSITE PATTERN DEMO");
        //2 teachers other than HOD works in Mathematic deparment
        SimpleEmployee mathTeacher1 = new SimpleEmployee("Math Teacher-1", "Maths");
        SimpleEmployee mathTeacher2 = new SimpleEmployee("Math teacher-2", "Maths");

        //Teachers other than HOD works in CSE department
        SimpleEmployee cseTeacher1 = new SimpleEmployee("CSE Teacher-1", "Computer Sc.");
        SimpleEmployee cseTeacher2 = new SimpleEmployee("CSE Teacher-2", "Computer Sc.");
        SimpleEmployee cseTeacher3 = new SimpleEmployee("CSE Teacher-3", "Computer Sc.");

        //THe college has 2 head of departments - one from mathematics, one from computer sc.
        CompositeEmployee hodMaths = new CompositeEmployee("Mrs.S.Das(HOD-Maths)", "Maths");
        CompositeEmployee hodCompSc = new CompositeEmployee("Mr. V.Sarcar(HOD-CSE)", "Computer Sc.");

        //principal
        CompositeEmployee principal = new CompositeEmployee("Dr.Corny (Principal)", "Planning-Supervising-Managing");

        //Teachers of Mathematics directly reports to HOD-Maths
        hodMaths.addEmployee(mathTeacher1);
        hodMaths.addEmployee(mathTeacher2);

        //teachers of Computer Sc directly reports to HOD-CSE
        hodCompSc.addEmployee(cseTeacher1);
        hodCompSc.addEmployee(cseTeacher2);
        hodCompSc.addEmployee(cseTeacher3);

        //PRincipal is on top of college.HOD - Maths and Comp. Sc directly reports to him
        principal.addEmployee(hodMaths);
        principal.addEmployee(hodCompSc);

        //Printing the leaf-nodes and branches in the same way i.e.
        //in each case, we are calling PrintStructures() method

        System.out.println("\n Testing the structure of a Principal object");
        //Prints the complete structure
        principal.printStructures();
        System.out.println("At present Principal has control over "+ principal.getEmployeeCount() + " number of employees.");

        System.out.println("\n Testing the structure of a HOD-CSE object:");
        //Prints the details of Computer Sc, department
        hodCompSc.printStructures();
        System.out.println("At present HOD-CSE has control over " + hodCompSc.getEmployeeCount() + " number of employees.");

        System.out.println("\n Testing the structure of a HOD-Maths object:");
        //prints the details of Mathematics department
        hodMaths.printStructures();
        System.out.println("At present HOD-Maths has control over " + hodMaths.getEmployeeCount() + " number of employees.");


        //Leaf node
        System.out.println("\n Testing the structure of a leaf node:");
        mathTeacher1.printStructures();
        System.out.println("At present Math Teacher-1 has control over " + mathTeacher1.getEmployeeCount() + " number of employees.");

        //Suppose one computer teacher is leaving now from the org
        hodCompSc.removeEmployee(cseTeacher2);
        System.out.println("\n After CSE Teacher-2 resigned, the organization has following members:");
        principal.printStructures();

        System.out.println("At present Principal has control over " + principal.getEmployeeCount() + " number of employees");
        System.out.println("AT present HOD-CSE has control over " + hodCompSc.getEmployeeCount() + " number of employees.");
        System.out.println("At present HOD-maths has control over " + hodMaths.getEmployeeCount() + " number of employees.");
    }
}
