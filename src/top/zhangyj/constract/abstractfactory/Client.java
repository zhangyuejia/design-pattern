package top.zhangyj.constract.abstractfactory;


/**
 * 创建型模式-抽象工厂模式
 *抽象工厂是指当有多个抽象角色时使用的一种工厂模式。抽象工厂模式可以向客户端提供一个接口，使客户端在不必指定产品的具体情况下，创建多个产品族中的产品对象。
 * @author zhangyj
 */
public class Client {

    public static void main(String[] args) {
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
}
