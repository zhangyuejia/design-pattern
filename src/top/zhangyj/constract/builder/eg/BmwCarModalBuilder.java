package top.zhangyj.constract.builder.eg;

import java.util.List;

public class BmwCarModalBuilder extends AbstractCarModalBulider{
    private AbstractCarModal carModal = new BmwCarModal();

    @Override
    public void setSequence(List<String> sequence) {
        this.carModal.setSequence(sequence);
    }

    @Override
    public AbstractCarModal getCarModal() {
        return this.carModal;
    }
}
