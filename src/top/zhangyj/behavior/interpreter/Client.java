package top.zhangyj.behavior.interpreter;

import java.util.Stack;

/**
 * 行为型模式：拦截器模式（拦截器模式可以拆分为 调度器 拦截器 业务逻辑 三部分）
 * ·调度器
 * 一个业务逻辑可以有N个拦截器，这些拦截器是怎么运行的，自然是需要有一个调度器从中调度。
 * ·拦截器
 * 拦截器就只是负责拦截业务代码，在业务代码前后做一些操作，至于拦截器和业务代码的关系，拦截器不会直接调用业务代码，因为会耦合，拦截器在处理完自己的逻辑，会通知调度器，由调度器负责后续的操作，是继续拦截，还是调用业务逻辑。
 * ·业务逻辑
 * 业务代码这一块没啥好说的。
 * @author zhangyj
 */
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
