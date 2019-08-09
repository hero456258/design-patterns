package com.mingqian.decorator;

import java.math.BigDecimal;

/**
 * Created by mingqian on 2019/7/31.
 * 抽象层
 */
public abstract class Drink {

    /**描述*/
    public String desc;

    /**单价*/
    private BigDecimal price = BigDecimal.ZERO;

    /**数量*/
    private Integer amount;

    /**
     * 计算费用的抽象方法
     * 子类来实现
     * @return
     */
    public abstract BigDecimal cost();

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

}
