package com.mingqian.template.improve;

/**
 * Created by mingqian on 2019/8/7.
 * 红豆豆浆
 */
public class RedBeanSoyaMilk extends SoyaMilk {

    /**
     * 添加不同的配料，抽象方法，子类具体实现
     */
    @Override
    void addCondiments() {
        System.out.println("加入上好的红豆");
    }
}
