package top.zhangyj.behavior.strategy.eg;

import top.zhangyj.behavior.strategy.eg.behavior.impl.FlyWithWings;
import top.zhangyj.behavior.strategy.eg.behavior.impl.Quack;

/**
 * 绿头鸭
 */
public class MallarDuck extends Duck{

    public MallarDuck() {
        //可飞
        flyBehavior = new FlyWithWings();
        //呱呱叫
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("看着像绿头鸭");
    }

}