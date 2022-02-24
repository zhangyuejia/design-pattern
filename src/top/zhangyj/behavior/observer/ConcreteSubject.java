package top.zhangyj.behavior.observer;

public class ConcreteSubject extends Subject {

    public void doSomething() {
        System.out.println("execute ConcreteSubject doSomething()");
        System.out.println("start notify...");
        super.notifyObservers();
    }
}
