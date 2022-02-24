package top.zhangyj.structure.composite.transparent;


import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        this.components.add(component);
    }

    @Override
    public void remove(Component component) {
        this.components.remove(component);
    }

    @Override
    public List<Component> getChildren() {
        return this.components;
    }
}
