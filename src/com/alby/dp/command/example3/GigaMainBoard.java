package com.alby.dp.command.example3;

/**
 * Created by xianwei on 2015/12/6.
 * 技嘉主板类，Receiver
 */
public class GigaMainBoard implements MainBoardApi {
    @Override
    public void open() {
        System.out.println("技嘉主板现在正在开机，请稍后。。。");
        System.out.println("接通电源........");
        System.out.println("设备检查.........");
        System.out.println("装载系统.........");
        System.out.println("机器正常运转起来....");
        System.out.println("一开机，请操作...........");
    }

    @Override
    public void reset() {
        System.out.println("技嘉主板现在正在重启，请稍后。。。");
    }
}
