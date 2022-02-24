package top.zhangyj.behavior.templatemethod;

public class ConcreteClass extends AbstractClass{
    @Override
    protected void doSomething() {
        System.out.println("execute ConcreteClass doSomething()");
    }

    @Override
    protected void doAnything() {
        System.out.println("execute ConcreteClass doAnything()");
    }
}
