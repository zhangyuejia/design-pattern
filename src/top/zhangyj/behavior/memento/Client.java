package top.zhangyj.behavior.memento;

/**
 * 行为型模式：备忘录模式
 * 备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象
 * @author zhangyj
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator("原始状态");
        System.out.println("状态："+originator.getState());
        Memento memento = originator.createMemento();
        originator.setState("修改状态");
        System.out.println("状态："+originator.getState());
        originator.restoreMemento(memento);
        System.out.println("状态："+originator.getState());
    }
}
