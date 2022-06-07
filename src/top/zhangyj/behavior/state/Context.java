package top.zhangyj.behavior.state;

public class Context extends State{

    public Context() {
        this.currentState = STATE_1;
    }

    /**
     * 拥有所有状态，然后各状态
     */
    public final State STATE_1 = new ConcreteState1(this);
    public final State STATE_2 = new ConcreteState2(this);

    private State currentState;

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    /**
     * 将行为委托给具体的状态
     */
    @Override
    public void handle1(){
        this.currentState.handle1();
    }

    /**
     * 将行为委托给具体的状态
     */
    @Override
    public void handle2(){
        this.currentState.handle2();
    }
}
