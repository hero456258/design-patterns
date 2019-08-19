package com.mingqian.state;

/**
 * Created by mingqian on 2019/8/19.
 * 状态接口抽象层
 */
public interface IState {

    /**
     * 扣除积分-50
     */
    public void deductMoney();

    /**
     * 是否抽中奖品
     * @return
     */
    public boolean raffle();

    /**
     * 发放奖品
     */
    public void dispensePrize();
}
