package com.mingqian.decorator.mycoffee;

import com.mingqian.decorator.Drink;

import java.math.BigDecimal;

/**
 * Created by mingqian on 2019/7/31.
 * 咖啡缓冲层
 */
public class Coffee extends Drink {

    /**
     * 计算费用的抽象方法
     * 子类来实现
     *
     * @return
     */
    @Override
    public BigDecimal cost() {
        //单价*数量
        return super.getPrice().multiply(BigDecimal.valueOf(super.getAmount()));
    }
}
