package com.mingqian.decorator.mydecorator;

import com.mingqian.decorator.Drink;

import java.math.BigDecimal;

/**
 * Created by mingqian on 2019/7/31.
 */
public class Soy extends Decorator {

    public Soy(Drink drink) {
        super(drink);
        setDesc("豆浆");
        setPrice(BigDecimal.valueOf(1.5));
    }
}
