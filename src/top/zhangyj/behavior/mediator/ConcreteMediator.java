package top.zhangyj.behavior.mediator;

public class ConcreteMediator extends Mediator {
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;
    
    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }
 
    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }
 
    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == colleague1) {
            colleague2.Notify(message);
        } else {
            colleague1.Notify(message);
        }
    }
}