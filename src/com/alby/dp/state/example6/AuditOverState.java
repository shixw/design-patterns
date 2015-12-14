package com.alby.dp.state.example6;

/**
 * Created by xianwei on 2015/12/14.
 *  处理审核结束的类
 */
public class AuditOverState implements State {
    @Override
    public void doWork(StateMachine request) {
        //先把业务对象造型回来
        LeaveRequestModel lrm = (LeaveRequestModel) request.getBusinessVO();

        //业务处理，在数据里面记录整个流程结束
    }
}
