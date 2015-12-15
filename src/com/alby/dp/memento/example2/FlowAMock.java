package com.alby.dp.memento.example2;

/**
 * Created by xianwei on 2015/12/15.
 * 模拟运行流程A
 */
public class FlowAMock {

    //流程名称，不需要外部存储的状态数据
    private String flowName;

    //中间结果，需要外部存储的状态数据
    private int tempResult;

    //中间结果，需要外部存储的状态数据
    private String tempState;

    public FlowAMock(String flowName) {
        this.flowName = flowName;
    }

    public int getTempResult() {
        return tempResult;
    }

    public void setTempResult(int tempResult) {
        this.tempResult = tempResult;
    }

    public String getTempState() {
        return tempState;
    }

    public void setTempState(String tempState) {
        this.tempState = tempState;
    }

    //运行第一个阶段
    public void runPhaseOne(){
        tempResult = 3;
        tempState = "PhaseOne0";
    }

    //按照方案一来运行流程后半部分
    public void schema1(){
        this.tempState += ",Schema1";
        System.out.println(this.tempState+" : now run "+tempResult);
        this.tempResult += 11;
    }

    //按照方案二来运行流程后半部分
    public void schema2(){
        this.tempState += ",Schema2";
        System.out.println(this.tempState+" : now run "+tempResult);
        this.tempResult += 22;
    }
}
