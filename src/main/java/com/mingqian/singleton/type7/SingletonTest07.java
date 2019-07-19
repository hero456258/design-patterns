package com.mingqian.singleton.type7;

/**
 * Created by mingqian on 2019/7/17.
 */
public class SingletonTest07 {
    public static void main(String[] args) {

        System.out.println("静态内部类，推荐使用----------> ");
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance的hashCode = " + instance.hashCode());
        System.out.println("instance1的hashCode = " + instance1.hashCode());

        /**
         * 运行结果：
         *     静态内部类，推荐使用---------->
         *     true
         *     instance的hashCode = 1163157884
         *     instance1的hashCode = 1163157884
         */

    }
}

/**
 * 静态内部类完成，推荐使用
 */
class Singleton {

    /**
     * 1.构造方法私有化
     */
    private Singleton() {

    }

    /**
     * 2.写一个静态内部类,该类中有一个静态属性 Singleton
     */
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 3.对外通过一个公共的方法，返回对象的实例
     * @return
     */
    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }

}
