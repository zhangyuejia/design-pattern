package top.zhangyj.behavior.mediator;

public class Mediator extends AbstractMediator {
    @Override
    public void doSomething1() {
        System.out.println("execute Mediator doSomething1()");
    }

    @Override
    public void doSomething2() {
        System.out.println("execute Mediator doSomething2()");
    }
}
