package top.zhangyj.behavior.state;

public class ConcreteState1 extends State {

    @Override
    public void hangdle1() {
        System.out.println("solving ConcreteState1 hangdle1()");
    }

    @Override
    public void hangdle2() {
        super.context.setCurrentState(Context.STATE_2);
        super.context.handle2();
    }
}
