package top.zhangyj.constract.prototype;

public class Client {
    public static void main(String[] args) {
        Prototype prototype = new Prototype("jcode");
        System.out.println(prototype.clone().getName());
    }
}
