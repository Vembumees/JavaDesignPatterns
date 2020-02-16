package Interpreter;

public class NotExpression implements IEmployee {

    private IEmployee emp;

    public NotExpression(IEmployee expr)
    {
        this.emp = expr;
    }


    @Override
    public boolean interpret(Context context) {
        return !emp.interpret(context);
    }
}
