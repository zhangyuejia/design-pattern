package top.zhangyj.constract.factorymethod;

/**
 * 创建型模式：工厂方法
 * @author zhangyj
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new Factory();
        AbstractProduct product = factory.createProduct(Product.class);
        product.method();
    }
}
