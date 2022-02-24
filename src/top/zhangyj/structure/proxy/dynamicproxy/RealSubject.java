package top.zhangyj.structure.proxy.dynamicproxy;

public class RealSubject implements Subject {


    @Override
    public void print(String str) {
        System.out.println("execute RealSubject print().str is "+ str);
    }
}
