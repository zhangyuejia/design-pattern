package top.zhangyj.constract.builder.eg;

import java.util.List;

public class BanzCarModalBuilder  extends AbstractCarModalBulider{
    private AbstractCarModal carModal = new BanzCarModal();

    @Override
    public void setSequence(List<String> sequence) {
        this.carModal.setSequence(sequence);
    }

    @Override
    public AbstractCarModal getCarModal() {
        return this.carModal;
    }
}
