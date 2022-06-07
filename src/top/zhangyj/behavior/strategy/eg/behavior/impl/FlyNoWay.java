package top.zhangyj.behavior.strategy.eg.behavior.impl;

import top.zhangyj.behavior.strategy.eg.behavior.i.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly(){
        System.out.println("我不能飞……");
    }
}