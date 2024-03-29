package top.zhangyj.constract.factorymethod;

public abstract class AbstractFactory {
    public abstract <T extends Product> T  createProduct(Class<T> c);
}
