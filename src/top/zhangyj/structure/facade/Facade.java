package top.zhangyj.structure.facade;

public class Facade {
    private ClassA classA = new ClassA();
    private ClassB classB = new ClassB();
    private ClassC classC = new ClassC();

    public void methodA(){
        classA.doSomething1();
    }
    public void methodB(){
        classB.doSomething2();
    }
    public void methodC(){
        classC.doSomething3();
    }

}
