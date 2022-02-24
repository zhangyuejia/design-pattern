package top.zhangyj.structure.composite.transparent;

import java.util.List;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Deprecated
    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public List<Component> getChildren() {
        throw new UnsupportedOperationException();
    }
}
