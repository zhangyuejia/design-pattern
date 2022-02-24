package top.zhangyj.behavior.interpreter.eg;

/**
 * 符号解释器
 */
public abstract class SymbolExpression extends Expression{
    protected Expression leftExp;
    protected Expression rightExp;

    public SymbolExpression(Expression leftExp, Expression rightExp) {
        this.leftExp = leftExp;
        this.rightExp = rightExp;
    }
}
