package com.mingqian.factory.factorymethod.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by mingqian on 2019/7/23.
 */
public class PizzaStore {
    public static void main(String[] args) {
        //创建北京口味的各种Pizza
//        new BJOrderPizza();
        /**
         * 运行结果：
         *      input pizza 种类:
         *      cheese
         *      北京的奶酪pizza 准备原材料
         *      北京的奶酪pizzabaking;
         *      北京的奶酪pizzacuting;
         *      北京的奶酪pizzaboxing
         */

        //创建伦敦口味的各种Pizza
        new LDOrderPizza();
        /**
         * 运行结果：
         *  input pizza 种类:
         *  pepper
         *  伦敦的胡椒pizza 准备原材料
         *  伦敦的胡椒pizzabaking;
         *  伦敦的胡椒pizzacuting;
         *  伦敦的胡椒pizzaboxing
         *  input pizza 种类:
         */
    }
}
