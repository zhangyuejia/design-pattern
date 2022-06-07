package top.zhangyj.behavior.command;

/**
 * 行为型模式：命令模式
 * 请求以命令的形式包裹在对象中，并传给调用对象。调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令
 * @author zhangyj
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver = new ConcreteReciver1();
        AbstractCommand command = new AddCommand(receiver);
        invoker.setCommand(command);
        invoker.action();
    }
}
