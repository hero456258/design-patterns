package com.mingqian.visitor;

/**
 * Created by mingqian on 2019/8/9.
 */
public abstract class Action {

    /**
     * 得到男性的测评
     * @param man
     */
    public abstract void getManResult(Man man);

    /**
     * 得到女性的测评
     * @param women
     */
    public abstract void getWomenResult(Women women);
}
