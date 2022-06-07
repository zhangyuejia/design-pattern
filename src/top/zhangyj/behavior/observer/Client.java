package top.zhangyj.behavior.observer;

/**
 * 行为型模式：观察者模式
 * 当对象间存在一对多关系时，则使用观察者模式（Observer Pattern）。比如，当一个对象被修改时，则会自动通知依赖它的对象
 * @author zhangyj
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.addObserver(new ConcreteObserver());
        subject.doSomething();
    }
}
