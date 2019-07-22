package com.mingqian.factory.simplefactory.pizzastore.order;

/**
 * Created by mingqian on 2019/7/19.
 * 相当于一个客户端，发出订购
 */
public class PizzaStore {

    public static void main(String[] args) {

        //传统模式
        new OrderPizza();
        /**
         * 运行结果
         * 请输入披萨种类：
         * cheese
         * 给制作奶酪披萨准备原材料
         * 奶酪披萨baking;
         * 奶酪披萨cuting;
         * 奶酪披萨baking;
         * 请输入披萨种类：
         */

        //简单工厂模式
        new OrderPizzaUseFactory(new SimpleFactory());
        /**
         * 运行结果：
         *      请输入披萨种类：
         *      greek
         *      使用简单工厂模式:
         *      给希腊披萨准备原材料
         *      希腊披萨baking;
         *      希腊披萨cuting;
         *      希腊披萨boxing
         *      请输入披萨种类：
         */
    }
}
