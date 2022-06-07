package top.zhangyj.constract.builder;

/**
 * 创建型模式：构建者模式
 * 指将一个复杂对象的构造与它的表示分离
 * @author zhangyj
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.getProduct();
        product.doSomething();
    }
}
