package com.mingqian.strategy.improve;

/**
 * Created by mingqian on 2019/8/20.
 * 野鸭
 */
public class WildDuck extends Duck{

    /**
     * 假设野鸭飞的好，叫的也好
     */
    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new GoodQuackBehavior();
    }

    /**
     * 显示鸭子信息
     */
    @Override
    public void display() {
        System.out.println("---野鸭---");
    }
}
