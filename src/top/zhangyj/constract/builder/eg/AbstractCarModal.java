package top.zhangyj.constract.builder.eg;

import java.util.ArrayList;
import java.util.List;

abstract class AbstractCarModal {
    private List<String> sequence = new ArrayList<>();

    public final void setSequence(List<String> sequence){
        this.sequence = sequence;
    }

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    public final void run(){
        for(String actionName : this.sequence){
            if("start".equals(actionName)){
                this.start();
            }else if("stop".equals(actionName)){
                this.stop();
            }else if("alarm".equals(actionName)){
                this.alarm();
            }
        }
    }
}
