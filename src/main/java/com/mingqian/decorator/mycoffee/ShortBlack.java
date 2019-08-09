package com.mingqian.decorator.mycoffee;

import java.math.BigDecimal;

/**
 * Created by mingqian on 2019/7/31.
 * 黑咖啡
 */
public class ShortBlack extends Coffee {

    public ShortBlack() {
        setDesc("ShortBlack-黑咖啡");
        setPrice(BigDecimal.valueOf(4.00));
    }
}
