package com.mingqian.factory;

import java.util.Calendar;

/**
 * Created by mingqian on 2019/7/24.
 */
public class Factory {
    public static void main(String[] args) {
        // getInstance 是 Calendar 静态方法
        Calendar instance = Calendar.getInstance();

        // 注意月份下标从0开始，所以取月份要+1
        System.out.println("年:" + instance.get(Calendar.YEAR));
        System.out.println("月:" + (instance.get(Calendar.MONTH) + 1));
        System.out.println("日:" + instance.get(Calendar.DAY_OF_MONTH));
        System.out.println("时:" + instance.get(Calendar.HOUR_OF_DAY));
        System.out.println("分:" + instance.get(Calendar.MINUTE));
        System.out.println("秒:" + instance.get(Calendar.SECOND));
        /**
         * 运行结果：
         *      年:2019
         *      月:7
         *      日:24
         *      时:10
         *      分:46
         *      秒:40
         */
    }
}
