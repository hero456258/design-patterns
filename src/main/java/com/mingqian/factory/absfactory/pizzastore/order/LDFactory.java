package com.mingqian.factory.absfactory.pizzastore.order;

import com.mingqian.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import com.mingqian.factory.absfactory.pizzastore.pizza.LDPepperPizza;
import com.mingqian.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * Created by mingqian on 2019/7/24.
 * 工厂子类
 */
public class LDFactory implements AbsFactory {

    /**
     * @param orderType
     * @return
     */
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("---使用的是抽象工厂模式---");
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }
        if ("pepper".equals(orderType)){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
