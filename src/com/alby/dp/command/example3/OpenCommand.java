package com.alby.dp.command.example3;

/**
 * Created by xianwei on 2015/12/6.
 * 开机命令的实现，实现Command接口
 * 持有开机命令的真正实现，通过调用接收者的方法来实现命令
 */
public class OpenCommand implements Command {

    //持有真正实现命令的接收者--主板对象
    private MainBoardApi mainBoard = null;

    public OpenCommand(MainBoardApi mainBoard) {
        this.mainBoard = mainBoard;
    }

    @Override
    public void execute() {
        //对于命令对象根本不知道如何开机，去主板开机
        this.mainBoard.open();
    }
}
