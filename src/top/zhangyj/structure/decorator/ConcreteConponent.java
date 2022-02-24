package top.zhangyj.structure.decorator;

public class ConcreteConponent extends Conponent {
    @Override
    public void operate() {
        System.out.println("execute ConcreteConponent operate()");
    }
}
