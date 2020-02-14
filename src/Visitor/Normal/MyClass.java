package Visitor.Normal;

public class MyClass implements IOriginalInterface {
    private final int myInt;
    public MyClass()
    {
        myInt = 5;
    }

    public int getMyInt()
    {
        return myInt;
    }

    @Override
    public void acceptVisitor(IVisitor visitor)
    {
        visitor.visit(this);
    }
}
