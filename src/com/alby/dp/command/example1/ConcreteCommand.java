package com.alby.dp.command.example1;

/**
 * Created by xianwei on 2015/12/6.
 * 具体的命令实现对象
 */
public class ConcreteCommand implements Command {

    /**
     * 持有相应的接收者对象
     */
    private Receiver receiver = null;

    /**
     * 命令对象可以有自己的状态
     */
    private String state;

    /**
     * 闯入相应的接收者对象
     * @param receiver 相应的接收者对象
     */
    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //通常会转调接收者对象相应的方法，让接收者来真正执行功能
        receiver.action();
    }
}
