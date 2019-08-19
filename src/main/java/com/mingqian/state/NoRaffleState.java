package com.mingqian.state;

/**
 * Created by mingqian on 2019/8/19.
 * 不能抽奖状态
 */
public class NoRaffleState implements IState {

    /**聚合抽奖活动*/
    private RaffleActivity raffleActivity;

    public NoRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    /**
     * 扣除积分-50
     */
    @Override
    public void deductMoney() {
        System.out.println("扣除50积分成功，您可以抽奖了");
        raffleActivity.setState(raffleActivity.getCanRaffleState());
    }

    /**
     * 是否抽中奖品
     *
     * @return
     */
    @Override
    public boolean raffle() {
        System.out.println("扣了积分才能抽奖喔！");
        return false;
    }

    /**
     * 发放奖品
     */
    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
