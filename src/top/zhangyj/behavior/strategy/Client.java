package top.zhangyj.behavior.strategy;

/**
 * 行为型模式：策略模式
 * 策略模式定义了算法族，分别封装起来，让他们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。(tip：多用组合)
 * 策略模式会控制对象使用什么策略，而状态模式会自动改变状态
 * @author zhangyj
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategy1());
        context.doSomething();
        context = new Context(new ConcreteStrategy2());
        context.doSomething();
    }
}
