package com.mingqian.decorator.mycoffee;

import java.math.BigDecimal;

/**
 * Created by mingqian on 2019/7/31.
 * 无因咖啡
 */
public class DeCaf extends Coffee{

    public DeCaf() {
        setDesc(" 无因咖啡 ");
        setPrice(BigDecimal.valueOf(1.0));
    }
}
