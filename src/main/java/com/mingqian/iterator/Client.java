package com.mingqian.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mingqian on 2019/8/12.
 */
public class Client {
    public static void main(String[] args) {

        //创建学院
        List<College> colleges = new ArrayList<>();
        colleges.add(new ComputerCollege());
        colleges.add(new InfoCollege());
        OutPutImpl outPut = new OutPutImpl(colleges);
        outPut.printCollege();
        /**
         * 运行结果：
         *      -------计算机学院-------
         *      Java专业
         *      PHP专业
         *      大数据专业
         *      -------信息工程学院-------
         *      信息安全专业
         *      网络安全专业
         *      服务器安全专业
         */
    }
}
