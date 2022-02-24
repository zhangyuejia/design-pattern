package top.zhangyj.structure.proxy.dynamicproxy;

public class Client {
    public static void main(String[] args) {
        DynamicProxy proxy = new DynamicProxy(new RealSubject());
        proxy.invoke("print", "jcode");
    }
}
