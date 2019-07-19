package com.mingqian.singleton.type3;

/**
 * Created by mingqian on 2019/7/17.
 */
public class SingletonTest03 {
    public static void main(String[] args) {

        System.out.println("懒汉式1,线程不安全--------->");
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance的hashCode = " + instance.hashCode());
        System.out.println("instance1的hashCode = " + instance1.hashCode());

        /**
         * 运行结果：
         * 懒汉式1,线程不安全--------->
         * true
         * instance的hashCode = 1163157884
         * instance1的hashCode = 1163157884
         */
    }
}

/**
 * 懒汉式(线程不安全)
 * 当使用到该方法时，才去创建 instance
 */
class Singleton{

    private static Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
