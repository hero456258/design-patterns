package com.mingqian.builder.improve;

/**
 * Created by mingqian on 2019/7/25.
 * 房子 -> 产品 -> product
 */
public class House {

    /**打桩*/
    private String baise;

    /**砌墙*/
    private String wall;

    /**封顶*/
    private String roofed;

    public String getBaise() {
        return baise;
    }

    public void setBaise(String baise) {
        this.baise = baise;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
