package com.mingqian.factory.simplefactory.pizzastore.pizza;

/**
 * Created by mingqian on 2019/7/19.
 */
public class GreekPizza extends Pizza {
    /**
     * 准备远材料，不同的披萨不一样，因此我们做成抽象方法
     */
    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}
