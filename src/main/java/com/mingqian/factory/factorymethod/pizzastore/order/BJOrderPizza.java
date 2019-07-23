package com.mingqian.factory.factorymethod.pizzastore.order;

import com.mingqian.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.mingqian.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.mingqian.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * Created by mingqian on 2019/7/23.
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza = new BJCheesePizza();
            return pizza;
        }
        if("pepper".equals(orderType)){
            pizza = new BJPepperPizza();
            return pizza;
        }
        return pizza;
    }
}
