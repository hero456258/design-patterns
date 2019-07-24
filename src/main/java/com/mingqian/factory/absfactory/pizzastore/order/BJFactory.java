package com.mingqian.factory.absfactory.pizzastore.order;

import com.mingqian.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.mingqian.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.mingqian.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * Created by mingqian on 2019/7/24.
 * 工厂子类
 */
public class BJFactory implements AbsFactory {

    /**
     * @param orderType
     * @return
     */
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("---使用的是抽象工厂模式---");
        Pizza pizza = null;
        if ("cheese".equals(orderType)){
            pizza = new BJCheesePizza();
        }else if ("pepper".equals(orderType)){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
