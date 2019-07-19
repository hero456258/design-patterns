package com.mingqian.singleton.type4;

/**
 * Created by mingqian on 2019/7/17.
 */
public class SingletonTest04 {
    public static void main(String[] args) {

        System.out.println("懒汉式2,线程安全--------->");
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance的hashCode = " + instance.hashCode());
        System.out.println("instance1的hashCode = " + instance1.hashCode());

        /**
         * 运行结果：
         * 懒汉式2,线程安全--------->
         * true
         * instance的hashCode = 1163157884
         * instance1的hashCode = 1163157884
         */

    }
}

/**
 * 懒汉式(线程安全，同步方法)
 */
class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    /**
     * 提供一个静态的公共方法，加入同步处理代码，解决线程安全问题
     * @return
     */
    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
