package com.mingqian.strategy;

/**
 * Created by mingqian on 2019/8/19.
 */
public class ToyDuck extends Duck {
    /**
     * 显示鸭子信息
     */
    @Override
    public void display() {
        System.out.println("---玩具鸭---");
    }

    /**
     * 鸭子叫
     */
    @Override
    public void quack() {
        System.out.println("玩具鸭不能叫.......");
    }

    /**
     * 鸭子游泳
     */
    @Override
    public void swim() {
        System.out.println("玩具鸭不能游泳.......");
    }

    /**
     * 鸭子飞翔
     */
    @Override
    public void fly() {
        System.out.println("玩具鸭不能飞翔.......");
    }
}
