package com.alby.dp.command.example6;


/**
 * Created by xianwei on 2015/12/6.
 * 服务员，负责组合菜单，负责组装每个彩盒具体的厨师
 * 还负责执行调用，相当于标准Command模式的Client+Invoker
 */
public class Waiter {
    private MenuCommand menuCommand = new MenuCommand();

    public void orderDish(Command cmd){
        menuCommand.addCommand(cmd);
    }

    public void orderOver(){
        this.menuCommand.execute();
    }
}
