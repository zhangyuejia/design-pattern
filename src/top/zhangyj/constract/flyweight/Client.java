package top.zhangyj.constract.flyweight;

import org.junit.Assert;
import top.zhangyj.AbstractClient;

public class Client extends AbstractClient {

    @Override
    public void test() {
        final String entrinsic = "mykey";
        Flyweight flyweight1 = FlyweightFactory.getFlyweight(entrinsic);
        Flyweight flyweight2 = FlyweightFactory.getFlyweight(entrinsic);
        Assert.assertEquals(flyweight1 == flyweight2, true);
    }

    @Override
    public String getDesc() {
        return null;
    }
}
