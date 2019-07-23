package com.mingqian.factory.factorymethod.pizzastore.order;

import com.mingqian.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.mingqian.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import com.mingqian.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * Created by mingqian on 2019/7/23.
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza = new LDCheesePizza();
            return pizza;
        }

        if("pepper".equals(orderType)){
            pizza = new LDPepperPizza();
            return pizza;
        }

        return pizza;
    }
}
