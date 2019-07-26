package com.mingqian.builder.improve;

/**
 * Created by mingqian on 2019/7/25.
 */
public class Client {
    public static void main(String[] args) {

        //盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector director = new HouseDirector(commonHouse);
        House house = director.constructHouse();
        /**
         * 运行结果：
         *       普通房子打地基5米
         *       普通房子砌墙10cm
         *      普通房子屋顶
         */

        System.out.println("--------------------------");
        HighBuilding highBuilding = new HighBuilding();
        director.setHouseBuilder(highBuilding);
        House house1 = director.constructHouse();
        /**
         * 运行结果：
         *      --------------------------
         *      高楼的打地基100米
         *      高楼的砌墙20cm
         *      高楼的透明屋顶
         */

    }
}
