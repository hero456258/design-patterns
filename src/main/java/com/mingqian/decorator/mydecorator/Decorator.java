package com.mingqian.decorator.mydecorator;

import com.mingqian.decorator.Drink;

import java.math.BigDecimal;

/**
 * Created by mingqian on 2019/7/31.
 * 装饰者
 */
public class Decorator extends Drink {

    /**聚合抽象层*/
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    /**
     * 计算费用的抽象方法
     * 子类来实现
     *
     * @return
     */
    @Override
    public BigDecimal cost() {
        return super.getPrice().multiply(BigDecimal.valueOf(super.getAmount())).add(drink.cost());
    }

    @Override
    public String getDesc(){
        return desc + " " + getPrice() + " " + getAmount() + "&&" + drink.getDesc();
    }
}
