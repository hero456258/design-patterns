package com.mingqian.principle.segregation;

/**
 * Created by mingqian on 2019/7/10.
 */
public class Segregation1 {

    public static void main(String[] args) {

    }

}

/**
 * 接口
 */
interface Interface1 {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

class B implements Interface1 {

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

    @Override
    public void operation4() {
        System.out.println("B 实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B 实现了operation5");
    }
}

class D implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("D 实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D 实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D 实现了operation3");
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
 * 类A通过接口Interface1 依赖(使用)类B，但是只用到了1,2,3这三个方法
 */
class A {

    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }

    public void depend2(Interface1 interface1) {
        interface1.operation2();
    }

    public void depend3(Interface1 interface1) {
        interface1.operation3();
    }
}

/**
 * 类C通过接口Interface1 依赖(使用)类D，但是只用到了1,4,5这三个方法
 */
class C {

    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }
    public void depend4(Interface1 interface1) {
        interface1.operation4();
    }
    public void depend5(Interface1 interface1) {
        interface1.operation5();
    }

}



