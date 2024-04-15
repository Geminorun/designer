package com.itheima.behavior.responsibility;

/**
 * @Auther: lyl
 * @Date: 2024/2/1 18:04
 * @Description:
 */
public class GeneralManager extends Handler{

    public GeneralManager() {
        super(NUM_SEVEN);
    }

    @Override
    protected void handlerLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName()+"请假 "+leaveRequest.getNum()+"天 "+ leaveRequest.getContent());
        System.out.println("总经理审批同意");
    }
}
