package com.mingqian.flyweight;

/**
 * Created by mingqian on 2019/8/5.
 */
public class Client {
    public static void main(String[] args) {

        //1.创建一个工厂
        WebSiteFactory factory = new WebSiteFactory();

        //2.客户要一个新闻形式发布的网站
        WebSite news = factory.getWebSiteByType("新闻");
        news.use(new User("荆轲"));

        //3.客户要一个以博客形式发布的网站
        WebSite blog = factory.getWebSiteByType("博客");
        blog.use(new User("盖聂"));

        //4.客户要一个以博客形式发布的网站
        WebSite blog2 = factory.getWebSiteByType("博客");
        blog.use(new User("张良"));

        //5.客户要一个新闻形式发布的网站
        WebSite news2 = factory.getWebSiteByType("新闻");
        news2.use(new User("卫庄"));

        System.out.println("网站的分类共=" + factory.getWebSiteCount());

        /**
         * 运行结果：
         *      网站的发布形式为：新闻 在使用中...使用者是荆轲
         *      网站的发布形式为：博客 在使用中...使用者是盖聂
         *      网站的发布形式为：博客 在使用中...使用者是张良
         *      网站的发布形式为：新闻 在使用中...使用者是卫庄
         *      网站的分类共=2
         */
    }
}
