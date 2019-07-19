package com.mingqian.singleton.type5;

/**
 * Created by mingqian on 2019/7/17.
 */
public class SingletonTest05 {
    public static void main(String[] args) {

        System.out.println("懒汉式3同步代码块，线程不安全---------------->");
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance的hashCode = " + instance.hashCode());
        System.out.println("instance1的hashCode = " + instance1.hashCode());

        /**
         * 运行结果：
         * 懒汉式3同步代码块，线程不安全---------------->
         * true
         * instance的hashCode = 1163157884
         * instance1的hashCode = 1163157884
         */
    }
}

/**
 * 懒汉式(线程安全,同步代码块)
 */
class Singleton {
    private static Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }

}
