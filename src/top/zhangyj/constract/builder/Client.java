package top.zhangyj.constract.builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.getProduct();
        product.doSomething();
    }
}
