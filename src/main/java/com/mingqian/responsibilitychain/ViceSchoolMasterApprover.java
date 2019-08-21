package com.mingqian.responsibilitychain;

import java.math.BigDecimal;

/**
 * Created by mingqian on 2019/8/21.
 * 副校长审批
 */
public class ViceSchoolMasterApprover extends Approver {

    public ViceSchoolMasterApprover(String name) {
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
        if (purchaseRequest.getPrice().compareTo(BigDecimal.valueOf(30000))<=0 &&purchaseRequest.getPrice().compareTo(BigDecimal.valueOf(1000)) > 0){
            System.out.println(" 请求编号 id= " + purchaseRequest.getId() + " 被 " + this.name + " 处理");
        }else {
            approver.processRequest(purchaseRequest);
        }
    }
}
