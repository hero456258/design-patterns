package com.mingqian.template.improve;

/**
 * Created by mingqian on 2019/8/7.
 * 纯豆浆
 */
public class PureSoyaMilk extends SoyaMilk{

    @Override
    void addCondiments() {
        //空实现
    }

    /**
     * 钩子方法，决定是否添加配料
     *
     * @return
     */
    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
