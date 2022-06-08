package top.zhangyj.structure.bridge;

/**
 * 结构型模式：桥接模式
 * 桥接模式是将抽象部分与它的实现部分分离，使它们都可以独立地变化。它是用组合关系代替继承关系来实现
 * @author zhangyj
 */
public class Client {
    public static void main(String[] args) {
        Implementor implementor = new ContreteImplementor1();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.request();
    }
}
