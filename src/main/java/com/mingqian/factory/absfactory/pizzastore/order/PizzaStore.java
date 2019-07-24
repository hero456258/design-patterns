package com.mingqian.factory.absfactory.pizzastore.order;

/**
 * Created by mingqian on 2019/7/24.
 */
public class PizzaStore {

    public static void main(String[] args) {
        //北京pizza
       //new OrderPizza(new BJFactory());
        /**
         * 运行结果：
         *          请选择pizza 种类:
         *          pepper
         *          ---使用的是抽象工厂模式---
         *          北京的胡椒pizza 准备原材料
         *         北京的胡椒pizzabaking;
         *        北京的胡椒pizzacuting;
         *       北京的胡椒pizzaboxing
         *      请选择pizza 种类:
         */

        //伦敦pizza
        new OrderPizza(new LDFactory());
        /**
         * 运行结果：
         *      请选择pizza 种类:
         *      cheese
         *      ---使用的是抽象工厂模式---
         *      伦敦的奶酪pizza 准备原材料
         *      伦敦的奶酪pizzabaking;
         *      伦敦的奶酪pizzacuting;
         *      伦敦的奶酪pizzaboxing
         *      请选择pizza 种类:
         */

    }
}
