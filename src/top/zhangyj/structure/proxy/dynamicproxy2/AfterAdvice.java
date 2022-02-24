package top.zhangyj.structure.proxy.dynamicproxy2;

public class AfterAdvice implements IAdvice{

    @Override
    public void exec() {
        System.out.println("execute AfterAdvice exec()");
    }
}
