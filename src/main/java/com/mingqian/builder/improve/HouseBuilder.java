package com.mingqian.builder.improve;

/**
 * Created by mingqian on 2019/7/25.
 * 抽象的建造者
 */
public abstract class HouseBuilder {

    House house = new House();

    //将建造的流程写好，抽象方法
    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    /**
     * 建造房子好，将产品(房子)返回
     * @return
     */
    public House buildHouse(){
        return house;
    }

}
