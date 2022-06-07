package top.zhangyj.behavior.strategy.eg.behavior.impl;

public class MuteQuack implements top.zhangyj.behavior.strategy.eg.behavior.i.QuackBehavior {
    public void quack(){
        System.out.println("我不会叫……");
    }
}