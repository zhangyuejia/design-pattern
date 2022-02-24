package top.zhangyj.structure.proxy.dynamicproxy2;


public class Client {
    public static void main(String[] args) {
        Subject subjectProxy = DynamicProxy.newProxyInstance(new RealSubject());
        subjectProxy.request();
    }
}
