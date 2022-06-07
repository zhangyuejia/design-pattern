package top.zhangyj.behavior.mediator;

public abstract class Mediator {
    /**
     * 定义一个抽象的发送消息方法，得到同事对象和发送信息
     * @param message
     * @param colleague
     */
    public abstract void send(String message,Colleague colleague);
}