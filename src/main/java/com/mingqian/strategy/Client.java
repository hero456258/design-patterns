package com.mingqian.strategy;

/**
 * Created by mingqian on 2019/8/19.
 */
public class Client {
    public static void main(String[] args) {
        Duck duck = new ToyDuck();
        duck.display();
        duck.quack();
        duck.fly();
        duck.swim();

        /**
         * ---玩具鸭---
         *玩具鸭不能叫.......
         *玩具鸭不能飞翔.......
         *玩具鸭不能游泳.......
         */
    }
}
