package com.mingqian.bridge;

/**
 * Created by mingqian on 2019/7/30.
 */
public abstract class Phone {

    /**聚合手机品牌*/
    private Brand brand;

    public Phone(Brand brand){
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }
    protected void close() {
        brand.close();
    }
    protected void call() {
        brand.call();
    }
}
