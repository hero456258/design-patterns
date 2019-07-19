package com.mingqian.singleton.type8;

/**
 * Created by mingqian on 2019/7/17.
 */
public class SingletonTest08 {
    public static void main(String[] args) {

        System.out.println("枚举-------------->");
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance == instance1);
        System.out.println("instance的hashCode = " + instance.hashCode());
        System.out.println("instance1的hashCode = " + instance1.hashCode());

        /**
         * 运行结果：
         *     true
         *     instance的hashCode = 1163157884
         *     instance1的hashCode = 1163157884
         */
    }
}

/**
 * 使用枚举，可以实现单例, 推荐
 */
enum Singleton{
    /**属性*/
    INSTANCE;

    public void sayOk(){
        System.out.println("ok！");
    }
}
