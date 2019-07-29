package com.mingqian.adapter.classadapter;

/**
 * Create by mingqian on 2019/7/28.
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());

        /**
         * 运行结果：
         *      标准电压 = 220伏
         *      转换后电压为5V，可以充电-
         */
    }
}
