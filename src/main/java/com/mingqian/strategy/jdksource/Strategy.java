package com.mingqian.strategy.jdksource;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by mingqian on 2019/8/20.
 * 策略模式在JKD源码应用实例
 */
public class Strategy {
    public static void main(String[] args) {
        //数组
        Integer[] data = { 9, 1, 2, 8, 4, 3,3 };
        // 实现降序排序，返回-1放左边，1放右边，0保持不变
        /**
         * 1. 实现了 Comparator 接口（策略接口） , 匿名类 对象 new Comparator<Integer>(){..}
         * 2. 对象 new Comparator<Integer>(){..} 就是实现了 策略接口 的对象
         * 3. public int compare(Integer o1, Integer o2){} 指定具体的处理方式
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2){
                    return 1;
                }else {
                    return -1;
                }
            }
        };
    /*public static <T> void sort(T[] a, Comparator<? super T> c) {
        if (c == null) {
            sort(a);//默认方法
        } else {
            if (Arrays.LegacyMergeSort.userRequested)
                legacyMergeSort(a, c);
            else
                //使用策略对象c
                TimSort.sort(a, 0, a.length, c, null, 0, 0);
        }
    }*/

        Arrays.sort(data,comparator);
        System.out.println(Arrays.toString(data));//[1, 2, 3, 3, 4, 8, 9]

        //方式二 -lambda表达式实现，策略模式
        Integer[] data2 = { 19, 11, 12, 18, 14, 13 };
        Arrays.sort(data2,(x,y) -> {
           if (x > y){
               return -1;
           }else {
               return 1;
           }
        });
        System.out.println("data2 = " + Arrays.toString(data2));//data2 = [19, 18, 14, 13, 12, 11]
}
}
