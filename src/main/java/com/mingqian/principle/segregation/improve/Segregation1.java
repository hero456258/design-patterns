package com.mingqian.principle.segregation.improve;

/**
 * Created by mingqian on 2019/7/10.
 */
public class Segregation1 {
    public static void main(String[] args) {

        A a = new A();
        //类A通过接口去依赖(使用)类B
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        //类C通过接口去依赖(使用)类D
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());
        /**
         * 运行结果:
         *    B 实现了operation1
         *    B 实现了operation2
         *    B 实现了operation3
         *    D 实现了operation1
         *    D 实现了operation4
         *    D 实现了operation5
         */

    }
}

/**
 * 接口1
 */
interface Interface1 {
    void operation1();
}

/**
 * 接口2
 */
interface Interface2 {
    void operation2();

    void operation3();
}

/**
 * 接口3
 */
interface Interface3 {
    void operation4();

    void operation5();
}

class B implements Interface1, Interface2 {

    @Override
    public void operation1() {
        System.out.println("B 实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了operation3");
    }
}

class D implements Interface1, Interface3 {

    @Override
    public void operation1() {
        System.out.println("D 实现了operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现了operation5");
    }
}

/**
 * 类A通过 Interface1，Interface2 依赖(使用)类B，但只会用到1,2,3方法
 */
class A {

    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }

    public void depend2(Interface2 interface2) {
        interface2.operation2();
    }

    public void depend3(Interface2 interface2) {
        interface2.operation3();
    }
}

/**
 * 类C通过接口 Interface1，Interface3 依赖(使用) 类D，但是只会用到1,4,5方法
 */
class C {

    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }

    public void depend4(Interface3 interface3) {
        interface3.operation4();
    }

    public void depend5(Interface3 interface3) {
        interface3.operation5();
    }
}