package top.zhangyj.behavior.interpreter.eg;

import java.util.Map;

public class AddExpression extends SymbolExpression {
    public AddExpression(Expression leftExp, Expression rightExp) {
        super(leftExp, rightExp);
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return super.leftExp.interpreter(var) + super.rightExp.interpreter(var);
    }
}
