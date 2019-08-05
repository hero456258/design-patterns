package com.mingqian.flyweight;

/**
 * Created by mingqian on 2019/8/5.
 * 用户类
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
