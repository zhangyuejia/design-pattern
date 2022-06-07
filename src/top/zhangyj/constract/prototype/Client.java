package top.zhangyj.constract.prototype;

/**
 * 创建型模式：原型模式
 * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * @author zhangyj
 */
public class Client {
    public static void main(String[] args) {
        Prototype prototype = new Prototype("jcode");
        System.out.println(prototype.clone().getName());
    }
}
