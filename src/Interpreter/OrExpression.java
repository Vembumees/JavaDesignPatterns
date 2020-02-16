package Interpreter;

import IteratorPattern.Modified.Employee;

public class OrExpression implements IEmployee {
    private IEmployee emp1;
    private IEmployee emp2;

    public OrExpression(IEmployee emp1, IEmployee emp2)
    {
        this.emp1 = emp1;
        this.emp2 = emp2;
    }

    @Override
    public boolean interpret(Context context) {
        return emp1.interpret(context) || emp2.interpret(context);
    }
}
