package com.mingqian.responsibilitychain;

import java.math.BigDecimal;

/**
 * Created by mingqian on 2019/8/21
 * 部门审批人(教学主任)
 * .
 */
public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name) {
        super(name);
    }

    /**
     * 处理审批请求的方法，得到一个请求，
     * 处理是子类完成，因此该方法做成抽象
     *
     * @param purchaseRequest
     */
    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice().compareTo(BigDecimal.valueOf(5000)) <=0){
            System.out.println("请求的编号= " + purchaseRequest.getId() + "被" + this.name + "处理");
        }else {
            approver.processRequest(purchaseRequest);
        }

    }
}
