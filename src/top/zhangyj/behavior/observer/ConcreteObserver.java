package top.zhangyj.behavior.observer;

public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("execute ConcreteObserver update()");
    }
}
