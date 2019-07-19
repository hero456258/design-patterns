package com.mingqian.factory.simplefactory.pizzastore.order;

import com.mingqian.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.mingqian.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.mingqian.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.mingqian.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by mingqian on 2019/7/19.
 */
public class OrderPizza {

    public OrderPizza(){
        Pizza pizza = null;
        //订购披萨类型
        String orderType;
        do{
            orderType = getType();
            if("greek".equals(orderType)){
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            }

            if ("cheese".equals(orderType)){
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            }

            if ("pepper".equals(orderType)){
                pizza = new PepperPizza();
                pizza.setName("胡椒披萨");
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.bake();

        }while (true);
    }

    /**
     * 写一个方法，可以获取客户希望订购的披萨种类
     * @return
     */
    private String getType() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入披萨种类：");
        String message = null;
        try {
            message = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return message;

    }
}
