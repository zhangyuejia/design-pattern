package top.zhangyj.behavior.interpreter.eg;

import java.util.Map;
import java.util.Stack;

public class Calculator {
    private Expression expression;

    public Calculator(String expStr){
        Stack<Expression> stack = new Stack<>();
        char[] expChars = expStr.toCharArray();

        Expression leftExp;
        Expression rightExp;
        for (int i=0; i<expChars.length; i++){
            switch (expChars[i]){
                case '+':
                    leftExp = stack.pop();
                    rightExp = new VarExpression(String.valueOf(expChars[++i]));
                    stack.push(new AddExpression(leftExp, rightExp));
                    break;
                case '-':
                    leftExp = stack.pop();
                    rightExp = new VarExpression(String.valueOf(expChars[++i]));
                    stack.push(new SubExpression(leftExp, rightExp));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(expChars[i])));
                    break;
            }

        }
        this.expression = stack.pop();
    }

    public int run(Map<String, Integer> var){
        return this.expression.interpreter(var);
    }
}
