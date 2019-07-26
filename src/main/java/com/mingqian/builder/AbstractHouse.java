package com.mingqian.builder;

/**
 * Created by mingqian on 2019/7/25.
 */
public abstract class AbstractHouse {

    /**
     * 打地基
     */
    public abstract void buildBasic();

    /**
     * 砌墙
     */
    public abstract void buildWalls();

    /**
     * 封顶
     */
    public abstract void roofed();

    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }
}
