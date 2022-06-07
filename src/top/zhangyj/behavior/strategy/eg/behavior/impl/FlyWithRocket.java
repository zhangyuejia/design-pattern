package top.zhangyj.behavior.strategy.eg.behavior.impl;

import top.zhangyj.behavior.strategy.eg.behavior.i.FlyBehavior;

public class FlyWithRocket implements FlyBehavior {

    public void fly(){
        System.out.println("带上火箭筒，飞~~~");
    }
}