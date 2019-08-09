package com.mingqian.flyweight;

/**
 * Created by mingqian on 2019/8/5.
 * 具体的网站
 */
public class ConcreteWebSite extends WebSite{

    //共享的部分，内部状态
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    /**
     * 抽象方法
     *
     * @param user
     */
    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为：" + type + " 在使用中...使用者是" + user.getName());
    }
}
