package com.mingqian.strategy;

/**
 * Created by mingqian on 2019/8/19.
 * 鸭子
 */
public abstract class Duck {

    public Duck() {
    }

    /**
     * 显示鸭子信息
     */
    public abstract void display();

    /**
     * 鸭子叫
     */
    public void quack(){
        System.out.println("鸭子嘎嘎叫.......");
    }

    /**
     * 鸭子游泳
     */
    public void swim(){
        System.out.println("鸭子会游泳.......");
    }

    /**
     * 鸭子飞翔
     */
    public void fly(){
        System.out.println("鸭子会飞翔.......");
    }
}
