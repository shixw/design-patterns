package com.alby.dp.state.example6;

/**
 * Created by xianwei on 2015/12/14.
 * 处理部门经理的审核，处理后对应审核结束状态
 */
public class DepManagerState implements State {
    @Override
    public void doWork(StateMachine request) {
        //先把业务对象造型回来
        LeaveRequestModel lrm = (LeaveRequestModel) request.getBusinessVO();

        request.setBusinessVO(new AuditOverState());


    }
}
