package com.alby.dp.command.example3;

/**
 * Created by xianwei on 2015/12/6.
 * 重启命令的实现，实现Command接口
 * 持有重启命令的真正实现，通过调用接收者的方法来实现命令
 */
public class ResetCommand implements Command {

    //持有真正实现命令的接收者--主板对象
    private MainBoardApi mainBoard = null;

    public ResetCommand(MainBoardApi mainBoard) {
        this.mainBoard = mainBoard;
    }

    @Override
    public void execute() {
        //对于命令对象根本不知道如何重启，去主板重启
        this.mainBoard.reset();
    }
}
