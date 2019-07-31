package com.mingqian.decorator.mydecorator;

import com.mingqian.decorator.Drink;

import java.math.BigDecimal;

/**
 * Created by mingqian on 2019/7/31.
 */
public class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
        setPrice(BigDecimal.valueOf(2.00));
        setDesc("牛奶");
    }
}
