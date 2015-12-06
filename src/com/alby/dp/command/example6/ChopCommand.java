package com.alby.dp.command.example6;



/**
 * Created by xianwei on 2015/12/6.
 * 绿豆排骨煲
 */
public class ChopCommand implements Command {
    private CookApi cookApi = null;

    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }

    private int tableNum;

    public ChopCommand(int tableNum) {
        this.tableNum = tableNum;
    }

    @Override
    public int getTableNum() {
        return tableNum;
    }

    @Override
    public void execute() {
        this.cookApi.cook(tableNum,"绿豆排骨汤");
    }
}
