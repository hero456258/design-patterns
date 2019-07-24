package com.mingqian.factory.absfactory.pizzastore.order;

import com.mingqian.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * Created by mingqian on 2019/7/24.
 * 抽象工厂模式的抽象层(接口)
 */
public interface AbsFactory {

    /**
     * 让下面的工厂子类来 具体实现
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType);
}
