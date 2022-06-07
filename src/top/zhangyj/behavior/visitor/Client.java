package top.zhangyj.behavior.visitor;

/**
 * 行为型模式：访问者模式
 * 表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素类的前提下定义作用于这些元素的新操作
 * @author zhangyj
 */
public class Client {
    public static void main(String[] args) {
        Element element1 = ObjectStructure.getElememt();
        Element element2 = ObjectStructure.getElememt();
        element1.accept(new ConcreteVisitor());
        element2.accept(new ConcreteVisitor());
    }
}
