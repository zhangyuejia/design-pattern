package top.zhangyj.behavior.visitor;

public class ConcreteVisitor implements IVisitor {
    /**
     * 针对特定的实现类做出不同的表现
     * @param concreteElement2 concreteElement2
     */
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
