package com.itheima.behavior.responsibility;

/**
 * @Auther: lyl
 * @Date: 2024/2/1 18:04
 * @Description:
 */
public class GroupLeader extends Handler{

    public GroupLeader() {
        super(NUM_ONE, NUM_THREE);
    }

    @Override
    protected void handlerLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName()+"请假 "+leaveRequest.getNum()+"天 "+ leaveRequest.getContent());
        System.out.println("小组长审批同意");
    }
}
