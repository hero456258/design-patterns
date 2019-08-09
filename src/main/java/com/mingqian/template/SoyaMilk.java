package com.mingqian.template;

/**
 * Created by mingqian on 2019/8/7.
 * 抽象类：豆浆
 */
public abstract class SoyaMilk {

    /**
     * 模板方法可以做成final，
     * 不让子类去覆盖
     */
    final void make(){
        select();
        addCondiments();
        soak();
        beat();
    }

    /**
     * 选材料
     */
    void select(){
        System.out.println("选择新鲜的黄豆");
    }

    /**
     * 添加不同的配料，抽象方法，子类具体实现
     */
    abstract void addCondiments();

    /**
     * 浸泡
     */
    void soak(){
        System.out.println("浸泡黄豆和配料，需要三小时");
    }

    /**
     * 打碎
     */
    void beat(){
        System.out.println("黄豆和配料放到豆浆机打碎");
    }
}
