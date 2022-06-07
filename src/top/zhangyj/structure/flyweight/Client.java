package top.zhangyj.structure.flyweight;

import org.junit.Assert;

/**
 * 结构型模式：享元模式
 * 允许使用对象共享来有效地支持大量细粒度对象
 * @author zhangyj
 */
public class Client  {

    public static void main(String[] args) {
        final String entrinsic = "mykey";
        Flyweight flyweight1 = FlyweightFactory.getFlyweight(entrinsic);
        Flyweight flyweight2 = FlyweightFactory.getFlyweight(entrinsic);
        Assert.assertSame(flyweight1, flyweight2);
        System.out.println("");
    }
}
