package top.zhangyj.constract.builder.eg;

import java.util.List;

abstract class AbstractCarModalBulider {
    abstract public void setSequence(List<String> sequence);

    abstract public AbstractCarModal getCarModal();
}
