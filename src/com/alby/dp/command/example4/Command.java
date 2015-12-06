package com.alby.dp.command.example4;

/**
 * Created by xianwei on 2015/12/6.
 * 命令接口
 */
public interface Command {
    void execute();

    void undo();
}
