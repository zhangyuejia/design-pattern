package top.zhangyj.behavior.memento.cloneable;

public class Originator implements Cloneable {
    private String state;
    private Originator backup;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Originator(String state) {
        this.state = state;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void createMemeneto(){
        if(backup == null){
            backup = new Originator(this.state);
        }else{
            this.backup.setState(this.state);
        }
    }

    public void restoreMemento(){
        this.setState(this.backup.getState());
    }
}
