package com.mingqian.memento.theory;

/**
 * Created by mingqian on 2019/8/15.
 * 备忘录对象
 */
public class Memento {

    /**状态*/
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
