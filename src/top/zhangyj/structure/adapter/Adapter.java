package top.zhangyj.structure.adapter;

public class Adapter extends Adaptee implements Target {
    @Override
    public void doSomething() {
        System.out.println("adapte method begin");
        super.doSomething2();
        System.out.println("adapte method end");
    }
}
