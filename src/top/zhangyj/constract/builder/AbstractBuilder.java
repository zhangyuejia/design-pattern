package top.zhangyj.constract.builder;

abstract class AbstractBuilder {
    /**
     * 产品设置零件
     */
    abstract protected void setPart();

    abstract protected Product buildPart();
}
