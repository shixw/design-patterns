package com.alby.dp.command.example1;

/**
 * Created by xianwei on 2015/12/6.
 * 调用者
 */
public class Invoker {
    //持有命令对象
    private Command command = null;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void runCommand(){
        //调用命令对象的执行方法
        command.execute();
    }
}
