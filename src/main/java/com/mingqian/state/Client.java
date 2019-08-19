package com.mingqian.state;

/**
 * Created by mingqian on 2019/8/19.
 */
public class Client {
    public static void main(String[] args) {
        RaffleActivity activity = new RaffleActivity(1);

        // 我们连续抽300次奖
        for (int i = 0; i < 30; i++) {
            System.out.println("--------第" + (i + 1) + "次抽奖----------");
            // 参加抽奖，第一步点击扣除积分
            activity.debuctMoney();
            // 第二步抽奖
            activity.raffle();
        }

        /**
         *  --------第1次抽奖----------
         *  扣除50积分成功，您可以抽奖了
         *  正在抽奖，请稍等.....
         *  很遗憾没有抽中奖品！
         *  --------第2次抽奖----------
         *  扣除50积分成功，您可以抽奖了
         *  正在抽奖，请稍等.....
         *  很遗憾没有抽中奖品！
         *  --------第3次抽奖----------
         *  扣除50积分成功，您可以抽奖了
         *  正在抽奖，请稍等.....
         *  很遗憾没有抽中奖品！
         */
    }
}
