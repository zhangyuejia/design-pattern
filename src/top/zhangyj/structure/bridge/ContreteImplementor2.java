package top.zhangyj.structure.bridge;

public class ContreteImplementor2 implements Implementor {
    @Override
    public void doSomething() {
        System.out.println("execute ContreteImplementor2 doSomething()");
    }

    @Override
    public void doAnything() {
        System.out.println("execute ContreteImplementor2 doAnything()");
    }
}
