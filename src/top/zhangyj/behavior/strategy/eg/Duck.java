package top.zhangyj.behavior.strategy.eg;

public abstract class Duck {
    protected top.zhangyj.behavior.strategy.eg.behavior.i.FlyBehavior flyBehavior;
    protected top.zhangyj.behavior.strategy.eg.behavior.i.QuackBehavior quackBehavior;

    public void swim(){
        System.out.println("All duck can swim!");
    }

    public abstract void display();

    /**
     * 动态改变飞行行为
     */
    public void setFlyBehavior(top.zhangyj.behavior.strategy.eg.behavior.i.FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * 动态改变鸭叫行为
     */
    public void setQuackBehavior(top.zhangyj.behavior.strategy.eg.behavior.i.QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }
}