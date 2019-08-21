package com.mingqian.responsibilitychain;

import java.math.BigDecimal;

/**
 * Created by mingqian on 2019/8/21.
 */
public class Client {
    public static void main(String[] args) {
        //创建一个请求
        PurchaseRequest request = new PurchaseRequest(0,1, BigDecimal.valueOf(300001));
        //创建相关审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("李院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("吴校长");
        //需要将各个审批级别的下一个设置好 (处理人构成环形: )
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        departmentApprover.processRequest(request);
        /**
         * 运行结果:
         *       请求编号 id= 0 被 吴校长 处理
         */
    }
}
