package top.zhangyj.structure.proxy.dynamicproxy2;

public class BeforeAdvice implements IAdvice{

    @Override
    public void exec() {
        System.out.println("execute BeforeAdvice exec()");
    }
}
