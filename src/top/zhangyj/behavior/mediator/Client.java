package top.zhangyj.behavior.mediator;

/**
 * 行为型模式：中介者模式
 * 用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
 * @author zhangyj
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator=new ConcreteMediator();
        ConcreteColleague1 colleague1=new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2=new ConcreteColleague2(mediator);
 
        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);
 
        colleague1.send("早上好啊！");
        colleague2.send("早安！");
    }
}