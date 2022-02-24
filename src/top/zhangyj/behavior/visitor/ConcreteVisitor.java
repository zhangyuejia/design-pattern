package top.zhangyj.behavior.visitor;

public class ConcreteVisitor implements IVisitor {
    @Override
    public void visit(ConcreteElement2 concreteElement2) {
        System.out.println("visit concreteElement2");
        concreteElement2.doSomething();
    }

    @Override
    public void visit(ConcreteElement1 concreteElement1) {
        System.out.println("visit concreteElement1");
        concreteElement1.doSomething();
    }
}
