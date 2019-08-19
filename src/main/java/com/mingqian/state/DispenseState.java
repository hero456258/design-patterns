package com.mingqian.state;

/**
 * Created by mingqian on 2019/8/19.
 * 发放奖品状态
 */
public class DispenseState implements IState {

    /**
     * 聚合抽奖活动
     */
    private RaffleActivity raffleActivity;

    public DispenseState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    /**
     * 扣除积分-50
     */
    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }

    /**
     * 是否抽中奖品
     *
     * @return
     */
    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    /**
     * 发放奖品
     */
    @Override
    public void dispensePrize() {
        if (raffleActivity.getCount() > 0) {
            System.out.println("恭喜中奖了");
            // 改变状态为不能抽奖
            raffleActivity.setState(raffleActivity.getNoRafflleState());
        } else {
            System.out.println("很遗憾，奖品发送完了");
            // 改变状态为奖品发送完毕, 后面我们就不可以抽奖
            raffleActivity.setState(raffleActivity.getDispensOutState());
            //System.out.println("抽奖活动结束");
            //System.exit(0);
        }
    }
}
