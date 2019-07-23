package com.mingqian.factory.factorymethod.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by mingqian on 2019/7/23.
 */
public class PizzaStore {
    public static void main(String[] args) {
        while (true) {
            String type = getType();
            if ("bj".equals(type)) {
                //创建北京口味的各种Pizza
                new BJOrderPizza();

            } else if ("ld".equals(type)) {
                //创建伦敦口味的各种Pizza
                new LDOrderPizza();

            } else {
                System.out.println("订购披萨失败，结束！");
                break;
            }
        }
    }

    private static String getType() {
        try {
            BufferedReader string = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入想要地区的披萨种类:");
            String str = string.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
