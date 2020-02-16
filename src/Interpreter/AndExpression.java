package Interpreter;

public class AndExpression implements IEmployee{
    private IEmployee emp1;
    private IEmployee emp2;

    public AndExpression(IEmployee emp1, IEmployee emp2)
    {
        this.emp1 = emp1;
        this.emp2 = emp2;
    }

    @Override
    public boolean interpret(Context context) {
        return emp1.interpret(context) && emp2.interpret(context);
    }
}
