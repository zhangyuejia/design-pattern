package top.zhangyj.constract.factorymethod.simplefactory;

import top.zhangyj.constract.factorymethod.AbstractProduct;
import top.zhangyj.constract.factorymethod.Product;

/**
 * 创建型模式：简单工厂模式
 * @author zhangyj
 */
public class Client {
    public static void main(String[] args) {
        AbstractProduct product = Factory.createProduct(Product.class);
        product.method();
    }
}
