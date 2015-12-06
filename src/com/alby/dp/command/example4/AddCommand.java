package com.alby.dp.command.example4;

/**
 * Created by xianwei on 2015/12/6.
 * 加法命令
 */
public class AddCommand implements Command {
    private OperationApi operation = null;

    private int opeNum;

    /**
     * 传入具体执行计算的对象
     * @param operation 具体执行计算的对象
     * @param opeNum 要加上的数据
     */
    public AddCommand(OperationApi operation, int opeNum) {
        this.operation = operation;
        this.opeNum = opeNum;
    }

    @Override
    public void execute() {
        //转调接收者去执行功能
        operation.add(opeNum);
    }

    @Override
    public void undo() {
        operation.substract(opeNum);
    }
}
