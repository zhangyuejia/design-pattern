package top.zhangyj.structure.adapter;

public class Client {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.doSomething();

        target = new Adapter();
        target.doSomething();
    }
}
