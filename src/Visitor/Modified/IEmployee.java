package Visitor.Modified;

public interface IEmployee {
    void printStructures();
    void acceptVisitor(IVisitor visitor);
}
