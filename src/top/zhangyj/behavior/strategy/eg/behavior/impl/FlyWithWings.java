package top.zhangyj.behavior.strategy.eg.behavior.impl;

import top.zhangyj.behavior.strategy.eg.behavior.i.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    public void fly(){
        System.out.println("飞~~~");
    }
}