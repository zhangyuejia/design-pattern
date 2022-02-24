package top.zhangyj.behavior.mediator;

public class Client {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        Colleague1 c1 = new Colleague1(mediator);
        Colleague2 c2 = new Colleague2(mediator);
        c1.depMethod1();
        c1.selfMethod1();
        c2.depMethod2();
        c2.selfMethod2();
    }
}
