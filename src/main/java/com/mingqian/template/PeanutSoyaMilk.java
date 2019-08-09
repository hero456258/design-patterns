package com.mingqian.template;

/**
 * Created by mingqian on 2019/8/7.
 * 花生豆浆
 */
public class PeanutSoyaMilk extends SoyaMilk{

    /**
     * 添加不同的配料，抽象方法，子类具体实现
     */
    @Override
    void addCondiments() {
        System.out.println("加入上好的花生");
    }
}
