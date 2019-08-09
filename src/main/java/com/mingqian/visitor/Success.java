package com.mingqian.visitor;

/**
 * Created by mingqian on 2019/8/9.
 */
public class Success extends Action {

    /**
     * 得到男性的测评
     *
     * @param man
     */
    @Override
    public void getManResult(Man man) {
        System.out.println(" 男人给的评价该歌手很成功 !");
    }

    /**
     * 得到女性的测评
     *
     * @param women
     */
    @Override
    public void getWomenResult(Women women) {
        System.out.println(" 女人给的评价该歌手很成功 !");
    }
}
