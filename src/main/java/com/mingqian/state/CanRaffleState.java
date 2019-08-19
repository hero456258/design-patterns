package com.mingqian.state;

import java.util.Random;

/**
 * Created by mingqian on 2019/8/19.
 * 可以抽奖状态
 */
public class CanRaffleState implements IState {

    /**
     * 聚合抽奖活动
     */
    private RaffleActivity raffleActivity;

    public CanRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    /**
     * 扣除积分-50
     */
    @Override
    public void deductMoney() {
        System.out.println("已经扣取过积分了");
    }

    /**
     * 是否抽中奖品
     *
     * @return
     */
    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请稍等.....");
        Random r = new Random();
        int num = r.nextInt(10);
        // 10%中奖机会
        if (num == 0) {
            // 改变活动状态为发放奖品 context
            raffleActivity.setState(raffleActivity.getDispenseState());
            return true;
        } else {
            System.out.println("很遗憾没有抽中奖品！");
            // 改变状态为不能抽奖
            raffleActivity.setState(raffleActivity.getNoRafflleState());
            return false;
        }
    }

    /**
     * 发放奖品
     */
    @Override
    public void dispensePrize() {
        System.out.println("没中奖，不能发放奖品");
    }
}
