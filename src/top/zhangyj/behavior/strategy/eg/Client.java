package top.zhangyj.behavior.strategy.eg;

/**
 * @author zhangyj
 */
public class Client {

    public static void main(String[] args) {
        duckPerform(new MallarDuck());
        duckPerform(new RedHeadDuck());
        duckPerform(new RubberDuck());
    }

    private static void duckPerform(Duck duck) {
        System.out.println("------------------------------");
        duck.display();
        duck.swim();
        duck.performFly();
        duck.performQuack();
    }
}
