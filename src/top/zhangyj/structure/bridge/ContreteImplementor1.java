package top.zhangyj.structure.bridge;

public class ContreteImplementor1 implements Implementor {
    @Override
    public void doSomething() {
        System.out.println("execute ContreteImplementor1 doSomething()");
    }

    @Override
    public void doAnything() {
        System.out.println("execute ContreteImplementor1 doAnything()");
    }
}
