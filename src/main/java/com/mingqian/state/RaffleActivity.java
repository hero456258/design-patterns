package com.mingqian.state;

/**
 * Created by mingqian on 2019/8/19.
 * 抽奖活动
 */
public class RaffleActivity {

    /**state表示当前的状态，是变化*/
    IState state = null;

    /**奖品数量*/
    int count = 0;

    /**四个属性，表示四种状态*/
    IState noRaffleState = new NoRaffleState(this);
    IState canRaffleState = new CanRaffleState(this);
    IState dispenseState = new DispenseState(this);
    IState dispenseOutState = new DispenseOutState(this);


    //构造器
    //1. 初始化当前的状态为 noRafflleState（即不能抽奖的状态）
    //2. 初始化奖品的数量
    public RaffleActivity( int count) {
        this.state = getNoRafflleState();
        this.count = count;
    }

    //扣分, 调用当前状态的 deductMoney
    public void debuctMoney(){
        state.deductMoney();
    }

    //抽奖
    public void raffle(){
        // 如果当前的状态是抽奖成功
        if(state.raffle()){
            //领取奖品
            state.dispensePrize();
        }

    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    //这里请大家注意，每领取一次奖品，count--
    public int getCount() {
        int curCount = count;
        count--;
        return curCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public IState getNoRafflleState() {
        return noRaffleState;
    }

    public void setNoRafflleState(IState noRafflleState) {
        this.noRaffleState = noRafflleState;
    }

    public IState getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(IState canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public IState getDispenseState() {
        return dispenseOutState;
    }

    public void setDispenseState(IState dispenseState) {
        this.dispenseState = dispenseState;
    }

    public IState getDispensOutState() {
        return dispenseOutState;
    }

    public void setDispensOutState(IState dispensOutState) {
        this.dispenseOutState = dispensOutState;
    }


}
