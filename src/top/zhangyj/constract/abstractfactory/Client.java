package top.zhangyj.constract.abstractfactory;

import top.zhangyj.AbstractClient;

public class Client extends AbstractClient {

    @Override
    public void test() {
        AbstractFactory factory1 = new Factory1();
        AbstractProductA productA1 = factory1.createProductA();
        AbstractProductB productB1 = factory1.createProductB();
        AbstractFactory factory2 = new Factory2();
        AbstractProductA productA2 = factory2.createProductA();
        AbstractProductB productB2 = factory2.createProductB();

        productA1.doSomething();
        productB1.doSomething();
        productA2.doSomething();
        productB2.doSomething();
    }

    @Override
    public String getDesc() {
        return null;
    }
}
