package top.zhangyj.structure.decorator;

public class Client {
    public static void main(String[] args) {
        Conponent conponent = new ConcreteConponent();
        conponent = new ConcreteDecorator1(conponent);
        conponent = new ConcreteDecorator2(conponent);
        conponent.operate();
    }
}
