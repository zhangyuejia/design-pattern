package top.zhangyj.behavior.memento;

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
