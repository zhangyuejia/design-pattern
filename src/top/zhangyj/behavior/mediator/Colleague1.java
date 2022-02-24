package top.zhangyj.behavior.mediator;

/**
 * 无抽象类，因为同事类基本无共同点·
 */
public class Colleague1 {
    private AbstractMediator mediator;

    public Colleague1(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    public void selfMethod1(){
        System.out.println("execute Colleague1 selfMethod1()");
    }

    public void depMethod1(){
        System.out.println("execute Colleague1 depMethod1()");
        mediator.doSomething1();
    }

}
