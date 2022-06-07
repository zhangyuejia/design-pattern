package top.zhangyj.behavior.strategy.eg;

import top.zhangyj.behavior.strategy.eg.behavior.impl.FlyNoWay;
import top.zhangyj.behavior.strategy.eg.behavior.impl.Squeak;

/**
 * 橡皮鸭
 */
public class RubberDuck extends Duck{

    public RubberDuck() {
        //不会飞
        flyBehavior = new FlyNoWay();
        //吱吱叫
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("看着像橡皮鸭");
    }

}