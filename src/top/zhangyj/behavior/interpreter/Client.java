package top.zhangyj.behavior.interpreter;

import java.util.Stack;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        //或者为List
        Stack<Expression> stack = new Stack<>();
        /*
         for(;;){
            //语法判断，递归调用
         } mk
         */
        Expression expression = stack.pop();
        expression.interpreter(context);
    }
}
