package top.zhangyj.behavior.templatemethodwithhook;

abstract class AbstractClass {
    protected abstract void doSomething();

    protected abstract void doAnything();

    // 钩子方法
    protected abstract boolean isExec();

    public void templateMethod(){
        if(isExec()){
            doSomething();
            doAnything();
        }
    }
}
