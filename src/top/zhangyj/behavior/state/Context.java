package top.zhangyj.behavior.state;

public class Context {
    public final static State STATE_1 = new ConcreteState1();
    public final static State STATE_2 = new ConcreteState2();

    private State currentState;

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        this.currentState.setContext(this);
    }

    public void handle1(){
        this.currentState.hangdle1();
    }

    public void handle2(){
        this.currentState.hangdle2();
    }

}
