package top.zhangyj.behavior.state;

public class ConcreteState1 extends State {
    protected final Context context;

    protected ConcreteState1(Context context) {
        this.context = context;
    }

    @Override
    public void handle1() {
        System.out.println("solving ConcreteState1 hangdle1()");
        System.out.println("自动转换到STATE_2");
        // 状态之间自动转换
        this.context.setCurrentState(this.context.STATE_2);
    }

    @Override
    public void handle2() {
        System.out.println("solving ConcreteState1 hangdle2()");
    }
}
