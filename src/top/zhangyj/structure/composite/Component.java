package top.zhangyj.structure.composite;

abstract class Component {
    private String name;

    public Component(String name) {
        this.name = name;
    }

    public void getInfo(){
        System.out.println("name:"+name);
    }
}
