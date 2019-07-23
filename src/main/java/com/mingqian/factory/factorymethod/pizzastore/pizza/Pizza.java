package com.mingqian.factory.factorymethod.pizzastore.pizza;

/**
 * Created by mingqian on 2019/7/19.
 * 将Pizza做成抽象类
 */
public abstract class Pizza {

    /**名字*/
    protected String name;

    /**
     * 准备远材料，不同的披萨不一样，因此我们做成抽象方法
     */
    public abstract void prepare();

    public void bake(){
        System.out.println(name + "baking;");
    }

    public void cut(){
        System.out.println(name + "cuting;");
    }

    public void box(){
        System.out.println(name + "boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
