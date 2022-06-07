package top.zhangyj.behavior.state;

/**
 * 行为型模式：状态模式
 * 定义： 状态模式允许对象在 内部 状态改变时改变他的行为，对象看起来好像修改了他的类。

 * @author zhangyj
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        context.handle1();
        context.handle2();
    }
}
