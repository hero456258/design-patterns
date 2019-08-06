package com.mingqian.proxy.dynamic;

/**
 * Created by mingqian on 2019/8/6.
 */
public class Client {
    public static void main(String[] args) {

        //1.创建目标对象
        ITeacherDao teacherDao = new TeacherDao();

        //2.给目标对象，创建代理对象，可以转成ITeacherDao
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        ITeacherDao instance = (ITeacherDao)proxyFactory.getProxyInstance();
        System.out.println(instance.getClass());//class com.sun.proxy.$Proxy0 内存中动态生成了代理对象

        //3.通过代理对象，调用目标对象的方法
        instance.sayHello("java");
        //instance.teach();
        /**
         * 运行结果：
         *   JDK动态代理开始
         *   hellojava
         *  JDK动态代理提交
         */
    }
}
