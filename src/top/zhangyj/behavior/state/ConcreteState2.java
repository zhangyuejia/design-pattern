package top.zhangyj.behavior.state;

public class ConcreteState2 extends State {

    protected final Context context;

    protected ConcreteState2(Context context) {
        this.context = context;
    }

    @Override
    public void handle1() {
        System.out.println("solving ConcreteState2 hangdle1()");
    }

    @Override
    public void handle2() {

        System.out.println("solving ConcreteState2 hangdle2()");
    }
}
