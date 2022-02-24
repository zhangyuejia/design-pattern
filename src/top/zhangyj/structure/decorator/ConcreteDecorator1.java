package top.zhangyj.structure.decorator;

public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Conponent conponent) {
        super(conponent);
    }

    @Override
    protected void execute() {
        System.out.println("execute ConcreteDecorator1 execute()");
    }
}
