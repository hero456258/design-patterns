package com.mingqian.builder.improve;

/**
 * Created by mingqian on 2019/7/25.
 * 指挥者，这里去指定制造流程，返回产品
 */
public class HouseDirector {

    HouseBuilder houseBuilder;

    /**
     * 构造器传入houseBuilder
     * @param houseBuilder
     */
    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    /**
     * 通过setter传入houseBuilder
     * @param houseBuilder
     */
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * 如何处理建造房子的流程，交给指挥者
     * @return
     */
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
