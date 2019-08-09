package com.mingqian.decorator;

import com.mingqian.decorator.mycoffee.DeCaf;
import com.mingqian.decorator.mycoffee.LongBlack;
import com.mingqian.decorator.mydecorator.Chocolate;
import com.mingqian.decorator.mydecorator.Milk;

/**
 * Created by mingqian on 2019/7/31.
 * 咖啡店
 */
public class CoffeeStore {
    public static void main(String[] args) {
        //装饰者模式下的订单: 2份巧克力 + 1份牛奶的LongBlack(美式咖啡)

        //1.点一份LongBlack
        Drink order = new LongBlack();
        order.setAmount(1);
        System.out.println("费用1=" + order.cost());
        System.out.println("描述=" + order.getDesc());

        //2.order加入1份牛奶
        order = new Milk(order);
        order.setAmount(1);
        System.out.println("order 加入一份牛奶 费用 =" + order.cost());
        System.out.println("order 加入一份牛奶 描述 = " + order.getDesc());

        //3.order加入1份巧克力
        order = new Chocolate(order);
        order.setAmount(1);
        System.out.println("order 加入一份牛奶 加入一份巧克力  费用 =" + order.cost());
        System.out.println("order 加入一份牛奶 加入一份巧克力 描述 = " + order.getDesc());


        //3.order加入1份巧克力
        order = new Chocolate(order);
        order.setAmount(1);
        System.out.println("order 加入一份牛奶 加入一份巧克力  费用 =" + order.cost());
        System.out.println("order 加入一份牛奶 加入一份巧克力 描述 = " + order.getDesc());


        Drink order2 = new DeCaf();
        order2.setAmount(1);
        System.out.println("order2 无因咖啡  费用 =" + order2.cost());
        System.out.println("order2 无因咖啡 描述 = " + order2.getDesc());

        order2 = new Milk(order2);
        order2.setAmount(1);
        System.out.println("order2 无因咖啡 加入一份牛奶  费用 =" + order2.cost());
        System.out.println("order2 无因咖啡 加入一份牛奶 描述 = " + order2.getDesc());

        /**
         * 运行结果：
         *      费用1=5.0
         *      描述=LongBlack-美式咖啡
         *      order 加入一份牛奶 费用 =7.0
         *      order 加入一份牛奶 描述 = 牛奶 2.0 1&&LongBlack-美式咖啡
         *      order 加入一份牛奶 加入一份巧克力  费用 =10.0
         *      order 加入一份牛奶 加入一份巧克力 描述 = 巧克力 3.0 1&&牛奶 2.0 1&&LongBlack-美式咖啡
         *      order 加入一份牛奶 加入一份巧克力  费用 =13.0
         *      order 加入一份牛奶 加入一份巧克力 描述 = 巧克力 3.0 1&&巧克力 3.0 1&&牛奶 2.0 1&&LongBlack-美式咖啡
         *      order2 无因咖啡  费用 =1.0
         *      order2 无因咖啡 描述 =  无因咖啡
         *      order2 无因咖啡 加入一份牛奶  费用 =3.0
         *      order2 无因咖啡 加入一份牛奶 描述 = 牛奶 2.0 1&& 无因咖啡
         */

    }
}
