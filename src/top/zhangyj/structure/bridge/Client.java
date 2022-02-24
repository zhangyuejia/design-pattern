package top.zhangyj.structure.bridge;

public class Client {
    public static void main(String[] args) {
        Implementor implementor = new ContreteImplementor1();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.request();
    }
}
