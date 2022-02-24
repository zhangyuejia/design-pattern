package top.zhangyj.structure.decorator;

public abstract class Decorator extends Conponent{
    private Conponent conponent;

    public Decorator(Conponent conponent) {
        this.conponent = conponent;
    }

    /**
     * 使用模板方法进行改造，原为子类覆盖并调用
     */
    @Override
    public void operate() {
        conponent.operate();
        this.execute();
    }

    protected abstract void execute();
}
