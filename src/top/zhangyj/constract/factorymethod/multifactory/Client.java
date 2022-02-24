package top.zhangyj.constract.factorymethod.multifactory;

import top.zhangyj.constract.factorymethod.AbstractProduct;
import top.zhangyj.constract.factorymethod.Product;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new Product1Factory();
        AbstractProduct product = factory.createProduct();
        product.method();
    }
}
