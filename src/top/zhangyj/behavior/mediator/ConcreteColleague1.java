package top.zhangyj.behavior.mediator;

public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }
 
    public void send(String message) {
        getMediator().send(message, this);
    }
 
    public void Notify(String message) {
        System.out.println("同事1收到消息：" + message);
    }
}
 
 
