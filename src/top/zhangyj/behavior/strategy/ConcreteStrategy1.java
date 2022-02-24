package top.zhangyj.behavior.strategy;

public class ConcreteStrategy1 implements IStrategy {
    @Override
    public void doSomething() {
        System.out.println("execute ConcreteStrategy1 doSomething()");
    }
}
