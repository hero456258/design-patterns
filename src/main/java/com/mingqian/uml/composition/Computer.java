package com.mingqian.uml.composition;


/**
 * Created by mingqian on 2019/7/16.
 */
public class Computer {

    private Mouse mouse = new Mouse(); //鼠标和电脑不能分离

    private Moniter moniter = new Moniter(); //显示器和电脑不能分离

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMoniter(Moniter moniter) {
        this.moniter = moniter;
    }
}
