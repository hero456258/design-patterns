package com.mingqian.singleton.type2;

/**
 * Created by mingqian on 2019/7/17.
 */
public class SingletonTest02 {
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
 * 饿汉式(静态代码块)
 */
class Singleton {

    /**
     * 1.构造方法私有化
     */
    private Singleton() {

    }

    /**
     * 2.声明静态的对象实例
     */
    private static Singleton instance;

    /**3.在静态代码块中，创建单例对象*/
    static {
        instance = new Singleton();
    }

    /**
     * 4.对象提供一个共开的静态方法，返回实例对象
     *
     * @return
     */
    public static Singleton getInstance() {
        return instance;
    }

}
