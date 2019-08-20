package com.mingqian.strategy.improve;

/**
 * Created by mingqian on 2019/8/20.
 */
public class ToyDuck extends Duck {

    /**
     * 玩具鸭不会叫也不会飞
     */
    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
        quackBehavior = new NoQuackBehavior();
    }

    /**
     * 显示鸭子信息
     */
    @Override
    public void display() {
        System.out.println("---玩具鸭---");
    }
}
