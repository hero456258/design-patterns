package com.mingqian.bridge;

/**
 * Created by mingqian on 2019/7/30.
 */
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");
    }

    @Override
    public void call() {
        System.out.println("小米手机拨号:151****1212");
    }
}
