package com.alby.dp.command.example6;


/**
 * Created by xianwei on 2015/12/6.
 * 命令接口
 */
public interface Command {
    void execute();

    //设置命令的接收者
    void setCookApi(CookApi cookApi);

    //返回发起请求的桌号，就是点菜的桌号
    int getTableNum();

}
