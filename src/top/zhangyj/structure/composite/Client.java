package top.zhangyj.structure.composite;

import java.util.List;

/**
 * 组合模式（安全模式，叶子节点和树枝节点结构不一样）
 * 组合模式依据树形结构来组合对象
 * @author zhangyj
 */
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
                component.getInfo();
            }else{
                component.getInfo();
                show((Composite)component);
            }
        }

    }
}
