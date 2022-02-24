package top.zhangyj.behavior.state;

public abstract class State {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    //行为1
    public abstract void hangdle1();

    //行为2
    public abstract void hangdle2();
}
