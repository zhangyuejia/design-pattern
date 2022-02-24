package top.zhangyj.structure.adapter;

public class ConcreteTarget implements Target {
    @Override
    public void doSomething() {
        System.out.println("execute ConcreteTarget doSomething()");
    }
}
