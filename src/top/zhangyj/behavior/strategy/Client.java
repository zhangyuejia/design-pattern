package top.zhangyj.behavior.strategy;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategy1());
        context.doSomething();
        context = new Context(new ConcreteStrategy2());
        context.doSomething();

    }
}
