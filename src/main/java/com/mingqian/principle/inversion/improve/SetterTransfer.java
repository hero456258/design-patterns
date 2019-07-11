package com.mingqian.principle.inversion.improve;

/**
 * Created by mingqian on 2019/7/11.
 * 依赖倒转:
 * setter方式传递
 */
public class SetterTransfer {
    public static void main(String[] args) {
        IOpenAndShutServiceImpl iOpenAndShutService = new IOpenAndShutServiceImpl();
        iOpenAndShutService.setTv(new XiaoMi());
        iOpenAndShutService.open();
        /**
         * 运行结果：
         *          小米电视机，打开
         */

    }
}

interface IOpenAndShutService {
    //打开抽象接口
    void open();

    //设置电视抽象方法
    void setTv(ITVService itvService);
}

interface ITVService {
    void play();
}

class IOpenAndShutServiceImpl implements IOpenAndShutService {

    private ITVService itvService;

    @Override
    public void open() {
        this.itvService.play();
    }

    @Override
    public void setTv(ITVService itvService) {
        this.itvService = itvService;
    }
}

class XiaoMi implements ITVService {

    @Override
    public void play() {
        System.out.println("小米电视机，打开");
    }
}