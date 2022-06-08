package top.zhangyj.structure.facade;

/**
 * 结构型模式：门面模式
 * 门面模式，是指提供一个统一的接口去访问多个子系统的多个不同的接口，
 * 它为子系统中的一组接口提供一个统一的高层接口。使得子系统更容易使用。
 * @author zhangyj
 */
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
