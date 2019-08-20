package com.mingqian.strategy.improve;

/**
 * Created by mingqian on 2019/8/20.
 */
public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.quack();
        wildDuck.fly();

        System.out.println("---------------");

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.fly();

        System.out.println("---------------");

        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.display();
        pekingDuck.fly();

        //动态改变某个对象的行为, 北京鸭 不能飞
        pekingDuck.setFlyBehavior(new NoFlyBehavior());
        System.out.println("北京鸭的实际飞翔能力");
        pekingDuck.fly();

        /**
         * 运行结果：
         *      ---野鸭---
         *      叫声非常好
         *      飞翔技术高超
         *      ---------------
         *      ---玩具鸭---
         *      不会飞翔
         *      ---------------
         *      ---北京鸭---
         *      飞翔技术一般
         *      北京鸭的实际飞翔能力
         *      不会飞翔
         */
    }
}
