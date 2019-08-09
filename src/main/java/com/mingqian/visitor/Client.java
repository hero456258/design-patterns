package com.mingqian.visitor;

/**
 * Created by mingqian on 2019/8/9.
 */
public class Client {
    public static void main(String[] args) {

        //创建ObjectStructure
        ObjectStructure structure = new ObjectStructure();
        structure.attach(new Man());
        structure.attach(new Women());

        //成功
        Success success = new Success();
        structure.display(success);

        System.out.println("----------------------------");

        Fail fail = new Fail();
        structure.display(fail);

        System.out.println("----------------------------");

        Wait wait = new Wait();
        structure.display(wait);


        /**
         * 运行结果 :
         *     男人给的评价该歌手很成功 !
         *     女人给的评价该歌手很成功 !
         *     ----------------------------
         *     男人给的评价该歌手失败 !
         *     女人给的评价该歌手失败 !
         *     ----------------------------
         *     男人给的评价是该歌手待定 ..
         *     女人给的评价是该歌手待定 ..
         */

    }
}
