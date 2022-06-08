package top.zhangyj.structure.adapter;

/**
 * 结构性模式：适配器模式
 * 将一个接口转换成客户希望的另一个接口，使接口不兼容的那些类可以一起工作，其别名为包装器(Wrapper)。
 * 适配器模式既可以作为类结构型模式，也可以作为对象结构型模式。
 * @author zhangyj
 */
public class Client {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        System.out.println("-----------------------------------------");
        target.doSomething();

        System.out.println("-----------------------------------------");
        target = new Adapter();
        target.doSomething();
    }
}
