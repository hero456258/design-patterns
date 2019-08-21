package com.mingqian.responsibilitychain;

import java.math.BigDecimal;

/**
 * Created by mingqian on 2019/8/21.
 * 请求类
 */
public class PurchaseRequest {

    private int id;

    private int type = 0;

    private BigDecimal price = BigDecimal.ZERO;

    public PurchaseRequest(int id, int type, BigDecimal price) {
        this.id = id;
        this.type = type;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
