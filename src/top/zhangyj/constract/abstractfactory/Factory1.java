package top.zhangyj.constract.abstractfactory;

public class Factory1 extends AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
