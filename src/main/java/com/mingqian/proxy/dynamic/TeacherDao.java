package com.mingqian.proxy.dynamic;

/**
 * Created by mingqian on 2019/8/6.
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师在讲解JDK动态代理.........");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello" + name);
    }
}
