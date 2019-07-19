package com.mingqian.singleton.type1;

/**
 * Created by mingqian on 2019/7/17.
 */
public class SingletonTest01 {
    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance的hashCode = " + instance.hashCode());
        System.out.println("instance1的hashCode = " + instance1.hashCode());

        /**
         * 运行结果：
         * true
         * instance的hashCode = 1163157884
         * instance1的hashCode = 1163157884
         */

    }
}

/**
 * 饿汉式(静态变量)
 */
class Singleton{

    /**
     * 1.构造方法私有化，防止外部new
     */
    private Singleton() {
    }

    /**2.内部创建对象实例*/
    private static final Singleton instance = new Singleton();

    /**
     * 3.对外提供一个公开的静态方法，返回对象实例
     * @return
     */
    public static Singleton getInstance() {
        return instance;
    }

}
