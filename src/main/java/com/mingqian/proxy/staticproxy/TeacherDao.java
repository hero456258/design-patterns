package com.mingqian.proxy.staticproxy;

/**
 * Created by mingqian on 2019/8/6.
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师在讲解静态代理..........");
    }
}
