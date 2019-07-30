package com.mingqian.bridge;

/**
 * Created by mingqian on 2019/7/30.
 */
public class Client {
    public static void main(String[] args) {

        Phone phone = new FoldedPhone(new XiaoMi());
        phone.open();
        phone.call();
        phone.close();
        /**
         * 运行结果：
         *      小米手机开机
         *      折叠样式手机
         *      小米手机拨号:151****1212
         *      折叠样式手机
         *      小米手机关机
         *      折叠样式手机
         */

        Phone phone1 = new UpRightPhone(new Vivo());
        phone1.open();
        phone1.call();
        phone1.close();
        /**
         * 运行结果：
         *      vivo手机开机
         *      直立样式手机
         *      vivo手机关机拨号:150****1212
         *      直立样式手机
         *      vivo手机关机
         *      直立样式手机
         */
    }
}
