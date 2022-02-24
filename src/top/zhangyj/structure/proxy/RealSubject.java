package top.zhangyj.structure.proxy;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("execute RealSubject request()");
    }
}
