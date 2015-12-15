package com.alby.dp.memento.example3;

import java.io.Serializable;

/**
 * Created by xianwei on 2015/12/15.
 * 模拟运行流程A
 */
public class FlowAMockPrototype implements Cloneable,Serializable{

    //流程名称，不需要外部存储的状态数据
    private String flowName;

    //中间结果，需要外部存储的状态数据
    private int tempResult;

    //中间结果，需要外部存储的状态数据
    private String tempState;

    public FlowAMockPrototype(String flowName) {
        this.flowName = flowName;
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

    //创建保存原发器对象的状态备忘录对象
    public FlowAMockMemento createMemento(){
        try {
            return new MementoImpl((FlowAMockPrototype) this.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void setMemento(FlowAMockMemento memento){
        MementoImpl mementoImpl = (MementoImpl) memento;
        this.tempResult = mementoImpl.getFlowAMock().tempResult;
        this.tempState = mementoImpl.getFlowAMock().tempState;
    }
    /**
     * 真正的备忘录对象，实现备忘录窄接口
     * 实现成私有的内部类，不让外部访问
     */
    private static class MementoImpl implements FlowAMockMemento{
        private static final long serialVersionUID = 806643461744842328L;
        private FlowAMockPrototype flowAMock = null;

        public MementoImpl(FlowAMockPrototype flowAMock) {
            this.flowAMock = flowAMock;
        }

        public FlowAMockPrototype getFlowAMock() {
            return flowAMock;
        }
    }
}
