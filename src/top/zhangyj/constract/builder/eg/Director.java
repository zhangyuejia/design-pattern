package top.zhangyj.constract.builder.eg;

import java.util.ArrayList;
import java.util.List;

public class Director {
    private List<String> sequence = new ArrayList<String>();

    private AbstractCarModalBulider banzCarModalBuilder = new BanzCarModalBuilder();

    private AbstractCarModalBulider bmwCarModalBuilder = new BmwCarModalBuilder();

    public AbstractCarModal getBanzCarModal() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("alarm");
        banzCarModalBuilder.setSequence(this.sequence);
        return banzCarModalBuilder.getCarModal();
    }

    public AbstractCarModal getBmwCarModal() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        bmwCarModalBuilder.setSequence(this.sequence);
        return bmwCarModalBuilder.getCarModal();
    }
}
