package com.mingqian.factory.absfactory.pizzastore.pizza;

/**
 * Created by mingqian on 2019/7/23.
 */
public class BJPepperPizza extends Pizza {

    /**
     * 准备远材料，不同的披萨不一样，因此我们做成抽象方法
     */
    @Override
    public void prepare() {
        setName("北京的胡椒pizza");
        System.out.println("北京的胡椒pizza 准备原材料");
    }
}
