package top.zhangyj.behavior.templatemethod;

/**
 * 行为型模式：模板方法模式
 * 定义一个操作中的算法骨架，而将算法的一些步骤延迟到子类中，使得子类可以不改变该算法结构的情况下重定义该算法的某些特定步骤
 * @author zhangyj
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.templateMethod();
    }
}
