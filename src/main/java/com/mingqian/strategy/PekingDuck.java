package com.mingqian.strategy;

/**
 * Created by mingqian on 2019/8/19.
 * 北京鸭子
 */
public class PekingDuck extends Duck {
    /**
     * 显示鸭子信息
     */
    @Override
    public void display() {
        System.out.println("---北京鸭子---");
    }

    /**
     * 因为北京鸭子不能飞翔，因此需要重写fly
     */
    @Override
    public void fly() {
        System.out.println("北京鸭子不能飞翔.......");
    }
}
