package com.mingqian.builder;

/**
 * Created by mingqian on 2019/7/25.
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
        /**
         * 运行结果：
         *      普通房子打地基
         *      通房子砌墙
         *      普通房子封顶
         */
    }
}
