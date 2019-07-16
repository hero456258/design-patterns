package com.mingqian.uml.composition;

/**
 * Created by mingqian on 2019/7/16.
 */
public class Person {

    private IDCard idCard;//聚合关系

    private Head head = new Head();//组合关系
}
