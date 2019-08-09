package com.mingqian.visitor;

/**
 * Created by mingqian on 2019/8/9.
 * 说明 :
 *      1.这里我们使用到了双分派，即首先在客户端程序中，将具体作为参数传递Man中(第一次分派)
 *      2.传入Man 类调用作为参数的“具体方法” 中方法 getManResult，同时将自己(this) 作为参数
 *        传入，完成第二次的分派
 */
public class Man extends Person {
    /**
     * 提供一个抽象方法，让访问者可以访问
     *
     * @param action
     */
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
