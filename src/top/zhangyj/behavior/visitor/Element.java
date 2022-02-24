package top.zhangyj.behavior.visitor;

abstract class Element {
    public abstract void doSomething();

    public abstract void accept(IVisitor visitor);
}
