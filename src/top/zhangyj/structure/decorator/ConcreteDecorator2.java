package top.zhangyj.structure.decorator;

public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Conponent conponent) {
        super(conponent);
    }

    @Override
    protected void execute() {
        System.out.println("execute ConcreteDecorator2 execute()");
    }
}
