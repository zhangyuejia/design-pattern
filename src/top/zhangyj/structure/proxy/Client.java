package top.zhangyj.structure.proxy;

/**
 * 结构性模式：代理模式
 * 为其他对象提供一种代理以控制对这个对象的访问。
 * @author zhangyj
 */
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
