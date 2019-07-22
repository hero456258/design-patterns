package com.mingqian.factory.simplefactory.pizzastore.order;

import com.mingqian.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.mingqian.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.mingqian.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.mingqian.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * Created by mingqian on 2019/7/22.
 * 简单工厂类
 */
public class SimpleFactory {

    /**
     * 增加orderType,返回对应的Pizza对象
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式:");

        if (orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
            return pizza;
        }
        if (orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
            return pizza;
        }
        if (orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
            return pizza;
        }
        return pizza;
    }

    /**
     * 简单工厂模式 也叫 静态工厂模式
     * @param orderType
     * @return
     */
    public static Pizza createPizzaStaticMethod(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式2:");
        if (orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if (orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }else if (orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
