package com.mingqian.principle.inversion.improve;

/**
 * Created by mingqian on 2019/7/11.
 * 依赖倒转:接口传递
 */
public class InterfaceTransfer {
    public static void main(String[] args) {
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(new ChangHong());
        /**
         *  运行结果:
         *          长虹电视机，打开
         */
    }
}

/**
 * 方式1:
 * 通过接口传递实现依赖
 * 开关接口
 */
interface IOpenAndClose {
    //抽象方法，接收接口
    void open(ITV itv);
}

/**
 * ITV接口
 */
interface ITV {
    void play();
}

/**
 * 电视类实现ITV接口
 */
class ChangHong implements ITV {
    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }
}

/**
 * 开关类实现开关接口
 */
class OpenAndClose implements IOpenAndClose {
    @Override
    public void open(ITV itv) {
        itv.play();
    }
}