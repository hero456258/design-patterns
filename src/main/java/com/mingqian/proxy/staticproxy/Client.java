package com.mingqian.proxy.staticproxy;

/**
 * Created by mingqian on 2019/8/6.
 */
public class Client {
    public static void main(String[] args) {

        //1.创建目标对象(被代理对象)
        TeacherDao target = new TeacherDao();

        //2.创建代理对象，同时将被代理对象传递给代理对象
        TeacherDaoProxy proxy = new TeacherDaoProxy(target);

        //3.通过代理对象，调用到被代理对象的方法；即：执行的是代理对象的方法，代理对象再去调用目标对象的方法
        proxy.teach();

        /**
         * 运行结果：
         *      开始静态代理......
         *      老师在讲解静态代理..........
         *      代理完毕..........
         */

    }
}
