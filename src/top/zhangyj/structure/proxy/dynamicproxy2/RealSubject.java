package top.zhangyj.structure.proxy.dynamicproxy2;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("execute RealSubject request()");
    }
}
