package com.alby.dp.command.example5;

/**
 * Created by xianwei on 2015/12/6.
 * 蒜泥白肉
 */
public class PorkCommand implements Command {
    private CookApi cookApi = null;

    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }

    @Override
    public void execute() {
        this.cookApi.cook(" 蒜泥白肉");
    }
}
