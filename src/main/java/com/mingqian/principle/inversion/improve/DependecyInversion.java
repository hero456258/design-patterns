package com.mingqian.principle.inversion.improve;

/**
 * Created by mingqian on 2019/7/11.
 * 依赖倒转(倒置)
 */
public class DependecyInversion {
    public static void main(String[] args) {

        //客户端无需改变
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeChat());
        /**
         * 运行结果:
         *      电子邮件信息:hello 鸣谦！
         *      微信信息: hello World!
         */
    }
}

/**
 * 定义接口设计并制定规范
 */
interface IReceive {
    String getInfo();
}

class Email implements IReceive {

    @Override
    public String getInfo() {
        return "电子邮件信息:hello 鸣谦！";
    }
}

/**
 * 增加微信
 */
class WeChat implements IReceive {

    @Override
    public String getInfo() {
        return "微信信息: hello World!";
    }
}

/**
 * 方式二
 */
class Person {

    //这里我们是对接口的依赖
    public void receive(IReceive receive) {
        System.out.println(receive.getInfo());
    }
}