package com.mingqian.responsibilitychain;

/**
 * Created by mingqian on 2019/8/21.
 * 审批抽象层
 */
public abstract class Approver {

    /**下一个处理者*/
    Approver approver;
    String name;

    /**
     * 处理审批请求的方法，得到一个请求，
     * 处理是子类完成，因此该方法做成抽象
     * @param purchaseRequest
     */
    public abstract void processRequest(PurchaseRequest purchaseRequest);

    public Approver(String name) {
        this.name = name;
    }

    /**
     * 设置下一个处理者
     * @param approver
     */
    public void setApprover(Approver approver) {
        this.approver = approver;
    }
}
