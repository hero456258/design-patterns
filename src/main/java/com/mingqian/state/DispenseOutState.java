package com.mingqian.state;

/**
 * Created by mingqian on 2019/8/19.
 * 奖品发放完毕
 * 说明:
 *      当我们activity 改变成 DispenseOutState,抽奖活动结束
 */
public class DispenseOutState implements IState {

    /**聚合抽奖活动*/
    private RaffleActivity raffleActivity;

    public DispenseOutState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    /**
     * 扣除积分-50
     */
    @Override
    public void deductMoney() {
        System.out.println("奖品发送完了，请下次再参加");
    }

    /**
     * 是否抽中奖品
     *
     * @return
     */
    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了，请下次再参加");
        return false;
    }

    /**
     * 发放奖品
     */
    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了，请下次再参加");
    }
}
