package com.mingqian.principle.inversion;

/**
 * Created by mingqian on 2019/7/11.
 */
public class DependecyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        /**
         * 运行结果:
         *          电子邮件信息:hello，鸣谦！
         */
    }
}

/**
 * 完成Person接收消息的功能
 * 方案1分析:
 * 1. 简单，比较容易想到
 * 2.如果我们获取的对象是微信，短信，等等则新增类，同时Person也要增加相应的接收方法
 * 3.解决思路: 引入一个抽象的接口IReceive，表示接收者，这样Person类与接口IReceive发生依赖
 * 因为Email，WeiXin 等等属于接收的范围，他们各自实现IReceive 接口就可以，这样我们
 * 就符合依赖倒转原则。
 */
class Email {
    public String getInfo() {
        return "电子邮件信息:hello，鸣谦！";
    }
}

class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
