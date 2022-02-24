package top.zhangyj.behavior.visitor;

public class ConcreteElement2 extends Element{

    @Override
    public void doSomething() {
        System.out.println("execute ConcreteElement2 doSomething()");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
