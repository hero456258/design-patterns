package com.mingqian.uml.aggregation;

/**
 * Created by mingqian on 2019/7/16.
 */
public class Computer {

    private Mouse mouse;//鼠标可和computer分离

    private Moniter moniter;//显示器可以和Computer分离


    public void setMoniter(Moniter moniter) {
        this.moniter = moniter;
    }
}
