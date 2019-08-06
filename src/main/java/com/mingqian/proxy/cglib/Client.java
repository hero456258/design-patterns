package com.mingqian.proxy.cglib;

/**
 * Created by mingqian on 2019/8/6.
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        //获取代理对象，并且将目标对象传递给代理对象
        ProxyFactory proxy = new ProxyFactory(teacherDao);
        TeacherDao dao = (TeacherDao)proxy.getProxyInstance();
        //执行代理对象的方法，触发intercept方法，从而实现对目标对象的调用
        String teach = dao.teach();
        System.out.println(teach);

        /**
         * 运行结果：
         *      cglib动态代理开始..........
         *      我是cglib代理，不需要实现接口
         *      cglib动态代理提交..........
         *      cglib
         */
    }
}
