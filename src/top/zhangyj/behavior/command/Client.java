package top.zhangyj.behavior.command;

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver = new ConcreteReciver1();
        AbstractCommand command = new AddCommand(receiver);
        invoker.setCommand(command);
        invoker.action();
    }
}
