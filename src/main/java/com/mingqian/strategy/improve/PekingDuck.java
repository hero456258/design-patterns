package com.mingqian.strategy.improve;

/**
 * Created by mingqian on 2019/8/20.
 * 北京鸭子
 */
public class PekingDuck extends Duck{

    /**
     * 假如北京鸭可以飞翔，但是飞翔技术一般,
     *      叫声也一般
     */
    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
        quackBehavior = new BadQuackBehavior();
    }

    /**
     * 显示鸭子信息
     */
    @Override
    public void display() {
        System.out.println("---北京鸭---");
    }
}
