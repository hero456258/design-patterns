package com.mingqian.proxy.cglib;

/**
 * Created by mingqian on 2019/8/6.
 */
public class TeacherDao {

    public String teach(){
        System.out.println("我是cglib代理，不需要实现接口");
        return "cglib";
    }
}
