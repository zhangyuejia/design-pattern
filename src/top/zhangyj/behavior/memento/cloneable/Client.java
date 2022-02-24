package top.zhangyj.behavior.memento.cloneable;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator("原始状态");
        System.out.println("状态："+originator.getState());
        originator.createMemeneto();
        originator.setState("修改状态");
        System.out.println("状态："+originator.getState());
        originator.restoreMemento();
        System.out.println("状态："+originator.getState());
    }
}
