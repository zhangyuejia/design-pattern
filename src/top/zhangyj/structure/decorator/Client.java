package top.zhangyj.structure.decorator;

/**
 * 结构性模式：装饰器模式
 * 允许向一个现有的对象添加新的功能，同时又不改变其结构。
 * @author zhangyj
 */
public class Client {
    public static void main(String[] args) {
        Conponent conponent = new ConcreteConponent();
        conponent = new ConcreteDecorator1(conponent);
        conponent = new ConcreteDecorator2(conponent);
        conponent.operate();
    }
}
