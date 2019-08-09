package com.mingqian.decorator.mycoffee;

import com.mingqian.decorator.mycoffee.Coffee;

import java.math.BigDecimal;

/**
 * Created by mingqian on 2019/7/31.
 * 美式咖啡
 */
public class LongBlack extends Coffee {

    public LongBlack() {
        setDesc("LongBlack-美式咖啡");
        setPrice(BigDecimal.valueOf(5.00));
    }
}
