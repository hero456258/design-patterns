package com.mingqian.factory.factorymethod.pizzastore.pizza;

/**
 * Created by mingqian on 2019/7/23.
 */
public class LDPepperPizza extends Pizza {

    /**
     * 准备远材料，不同的披萨不一样，因此我们做成抽象方法
     */
    @Override
    public void prepare() {
        setName("伦敦的胡椒pizza");
        System.out.println("伦敦的胡椒pizza 准备原材料");
    }
}
