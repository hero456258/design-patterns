package com.mingqian.strategy.improve;

/**
 * Created by mingqian on 2019/8/20.
 */
public class NoQuackBehavior implements QuackBehavior {
    /**
     * 让子类具体实现
     */
    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
