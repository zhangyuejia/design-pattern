package top.zhangyj.behavior.mediator;

public class Colleague2 {
    private AbstractMediator mediator;

    public Colleague2(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    public void selfMethod2(){
        System.out.println("execute Colleague1 selfMethod2()");
    }

    public void depMethod2(){
        System.out.println("execute Colleague1 depMethod2()");
        mediator.doSomething1();
    }

}
