package top.zhangyj.behavior.visitor;

public class Client {
    public static void main(String[] args) {
        Element element1 = ObjectStructure.getElememt();
        Element element2 = ObjectStructure.getElememt();
        element1.accept(new ConcreteVisitor());
        element2.accept(new ConcreteVisitor());
    }
}
