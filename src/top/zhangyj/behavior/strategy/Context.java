package top.zhangyj.behavior.strategy;

public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void doSomething(){
        strategy.doSomething();
    }
}
