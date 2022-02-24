package top.zhangyj.behavior.interpreter;


public class NonteriminalExpression extends Expression{
    public NonteriminalExpression(Expression... expressions){}

    @Override
    public Object interpreter(Context context) {
        return null;
    }
}
