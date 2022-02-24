package top.zhangyj.structure.composite.transparent;


import java.util.List;

public class Client {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        Leaf leaf1 = new Leaf("leaf1");
        Leaf leaf2 = new Leaf("leaf2");
        Composite branch = new Composite("branch1");
        branch.add(leaf2);
        root.add(branch);
        root.add(leaf1);
        show(root);
    }

    private static void show(Composite root) {
        List<Component> components = root.getChildren();
        for (Component component: components){
            if(component instanceof Leaf){
                component.doSomething();
            }else{
                component.doSomething();
                show((Composite)component);
            }
        }

    }
}
