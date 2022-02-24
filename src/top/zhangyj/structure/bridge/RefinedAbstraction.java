package top.zhangyj.structure.bridge;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    /**
     * 修正父类方法
     */
    @Override
    public void request() {
        super.request();
        super.getImplementor().doAnything();
    }


}
