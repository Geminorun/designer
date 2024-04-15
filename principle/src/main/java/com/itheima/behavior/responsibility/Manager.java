package com.itheima.behavior.responsibility;

/**
 * @Auther: lyl
 * @Date: 2024/2/1 18:04
 * @Description:
 */
public class Manager extends Handler{

    public Manager() {
        super(NUM_THREE, NUM_SEVEN);
    }

    @Override
    protected void handlerLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName()+"请假 "+leaveRequest.getNum()+"天 "+ leaveRequest.getContent());
        System.out.println("部门经理审批同意");
    }
}
