package com.alby.dp.command.example5;

/**
 * Created by xianwei on 2015/12/6.
 * 绿豆排骨煲
 */
public class ChopCommand implements Command {
    private CookApi cookApi = null;

    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }

    @Override
    public void execute() {
        this.cookApi.cook("绿豆排骨汤");
    }
}
