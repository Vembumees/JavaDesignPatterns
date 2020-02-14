package Visitor.Modified;

public interface IVisitor {

    void visitTheElement(CompositeEmployee employees);
    void visitTheElement(SimpleEmployee employee);
}

