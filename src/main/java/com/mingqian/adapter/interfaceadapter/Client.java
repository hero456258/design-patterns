package com.mingqian.adapter.interfaceadapter;

/**
 * Created by mingqian on 2019/7/29.
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter(){
            //只需要去覆盖我们使用接口方法
            @Override
            public void m1() {
                System.out.println("使用了m1的方法--");
            }
        };
        absAdapter.m1();

        /**
         * 运行结果：
         *     使用了m1的方法--
         */
    }
}
