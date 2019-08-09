package com.mingqian.template.improve;

/**
 * Created by mingqian on 2019/8/7.
 */
public class Client {
    public static void main(String[] args) {

        System.out.println("-------制作花生豆浆-----------");
        SoyaMilk milk = new PeanutSoyaMilk();
        milk.make();

        System.out.println("-------制作红豆豆浆-----------");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        System.out.println("-------制作纯豆浆-----------");
        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();

        /**
         * 运行结果：
         *   -------制作花生豆浆-----------
         *  选择新鲜的黄豆
         *  加入上好的花生
         *  浸泡黄豆和配料，需要三小时
         *  黄豆和配料放到豆浆机打碎
         *  -------制作红豆豆浆-----------
         *  选择新鲜的黄豆
         *  加入上好的红豆
         *  浸泡黄豆和配料，需要三小时
         *  黄豆和配料放到豆浆机打碎
         *  -------制作纯豆浆-----------
         *  选择新鲜的黄豆
         *  浸泡黄豆和配料，需要三小时
         *  黄豆和配料放到豆浆机打碎
         */

    }
}
