package com.mingqian.singleton.type6;

/**
 * Created by mingqian on 2019/7/17.
 */
public class SingletonTest06 {
    public static void main(String[] args) {

        System.out.println("双重检验--------------->");
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance的hashCode = " + instance.hashCode());
        System.out.println("instance1的hashCode = " + instance1.hashCode());

        /**
         * 运行结果：
         *     双重检验--------------->
         *     true
         *     instance的hashCode = 1163157884
         *     instance1的hashCode = 1163157884
         */
    }
}

/**
 * 懒汉式(线程安全，同步方法)
 */
class Singleton {

    /**1.声明的对象实例用volatile声明，使对象可见*/
    private static volatile Singleton instance;

    /**
     * 2.构造方法私有化
     */
    private Singleton() {

    }

    /**
     * 3.双重校验对象实例是否为null，通过synchronized赋值使对象可见
     *   同时保证了效率, 推荐使用
     * @return
     */
    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}