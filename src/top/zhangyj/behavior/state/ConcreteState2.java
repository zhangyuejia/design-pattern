package top.zhangyj.behavior.state;

public class ConcreteState2 extends State {

    @Override
    public void hangdle1() {
        super.context.setCurrentState(Context.STATE_1);
        super.context.handle1();
    }

    @Override
    public void hangdle2() {

        System.out.println("solving ConcreteState2 hangdle2()");
    }
}
