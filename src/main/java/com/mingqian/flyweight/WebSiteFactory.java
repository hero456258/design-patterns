package com.mingqian.flyweight;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by mingqian on 2019/8/5.
 * 网站的工厂类
 */
public class WebSiteFactory {

    //集合，充当池的作用
    private ConcurrentHashMap<String,WebSite> pool = new ConcurrentHashMap<>();

    /**
     * 根据网站的类型，返回一个网站，如果没有就创建一个网站，
     * 并放入到池中，并返回。
     * @param type
     * @return
     */
    public WebSite getWebSiteByType(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    /**
     * 获取网站的分类的总数(池中有多少个网站类型)
     * @return
     */
    public int getWebSiteCount(){
        return pool.size();
    }
}
