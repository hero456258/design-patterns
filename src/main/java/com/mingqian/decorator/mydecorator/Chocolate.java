package com.mingqian.decorator.mydecorator;

import com.mingqian.decorator.Drink;

import java.math.BigDecimal;

/**
 * Created by mingqian on 2019/7/31.
 * 具体的装饰者，这里就是调味品
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        setDesc("巧克力");
        setPrice(BigDecimal.valueOf(3.00));
    }
}
