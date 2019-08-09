package com.mingqian.visitor;

/**
 * Created by mingqian on 2019/8/9.
 */
public abstract class Person {

    /**
     * 提供一个抽象方法，让访问者可以访问
     * @param action
     */
    public abstract void accept(Action action);
}
