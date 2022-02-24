package top.zhangyj.structure.composite.transparent;

import java.util.List;

public abstract class Component {
    private String name;

    public Component(String name) {
        this.name = name;
    }

    public void doSomething(){
        System.out.println("execute Component doSomething() name:"+name);
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract List<Component> getChildren();
}
