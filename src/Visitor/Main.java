package Visitor;

public class Main {

    public static void main(String[] args) {
        System.out.println("VISITOR PATTERN DEMO");
        IVisitor visitor = new ConcreteVisitor();
        MyClass myClass = new MyClass();
        myClass.acceptVisitor(visitor);
    }
}
