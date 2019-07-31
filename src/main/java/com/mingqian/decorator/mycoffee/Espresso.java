package com.mingqian.decorator.mycoffee;

import java.math.BigDecimal;

/**
 * Created by mingqian on 2019/7/31.
 * 意大利咖啡
 */
public class Espresso extends Coffee {

    public Espresso() {
        setDesc("Espresso-意大利咖啡");
        setPrice(BigDecimal.valueOf(6.00));
    }
}
