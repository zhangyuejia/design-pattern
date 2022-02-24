package top.zhangyj.behavior.templatemethod;

abstract class AbstractClass {
    protected abstract void doSomething();

    protected abstract void doAnything();

    public void templateMethod(){
        doSomething();
        doAnything();
    }
}
