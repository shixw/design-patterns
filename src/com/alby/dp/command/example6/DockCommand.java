package com.alby.dp.command.example6;


/**
 * Created by xianwei on 2015/12/6.
 * 北京烤鸭
 */
public class DockCommand implements Command {
    private CookApi cookApi = null;

    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }
    private int tableNum;

    public DockCommand(int tableNum) {
        this.tableNum = tableNum;
    }

    @Override
    public int getTableNum() {
        return tableNum;
    }

    @Override
    public void execute() {
        this.cookApi.cook(tableNum,"北京烤鸭");
    }
}
