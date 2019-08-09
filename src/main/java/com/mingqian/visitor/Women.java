package com.mingqian.visitor;

/**
 * Created by mingqian on 2019/8/9.
 */
public class Women extends Person {
    /**
     * 提供一个抽象方法，让访问者可以访问
     *
     * @param action
     */
    @Override
    public void accept(Action action) {
        action.getWomenResult(this);
    }
}
