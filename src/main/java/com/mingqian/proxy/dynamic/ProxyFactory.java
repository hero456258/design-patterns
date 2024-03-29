package com.mingqian.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by mingqian on 2019/8/6.
 */
public class ProxyFactory {

    /**维护一个目标对象，object*/
    private Object target;

    /**
     * 带参构造方法，对target，进行初始化
     * @param target
     */
    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     *  public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
     *  1. ClassLoader loader ： 指定当前目标对象使用的类加载器, 获取加载器的方法固定
     *  2. Class<?>[] interfaces: 目标对象实现的接口类型，使用泛型方法确认类型
     *  3. InvocationHandler h : 事情处理，执行目标对象的方法时，会触发事情处理器方法, 会把当前执行的目标对象方法作为参数传入
     * @return
     */
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDK动态代理开始");
                //反射机制调用目标对象的方法
                Object retVal = method.invoke(target, args);
                System.out.println("JDK动态代理提交");
                return retVal;
            }
        });
    }
}
