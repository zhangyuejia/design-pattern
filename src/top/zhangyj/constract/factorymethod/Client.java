package top.zhangyj.constract.factorymethod;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new Factory();
        AbstractProduct product = factory.createProduct(Product.class);
        product.method();
    }
}
