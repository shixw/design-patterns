package com.alby.dp.command.example3;


public class Client {
    public static void main(String[] args) {
        //1：把命令和真正的实现组合起来，相当于在组装机器
        //把机箱上的按钮和连接线插到主板上
        MainBoardApi mainboard = new GigaMainBoard();

        OpenCommand openCommand = new OpenCommand(mainboard);


        ResetCommand resetCommand = new ResetCommand(mainboard);
        //为机箱上的按钮设置对象额命令，让按钮知道该干什么
        Box box = new Box();
        box.setOpenCommand(openCommand);
        box.setResetCommand(resetCommand);

        //按下开机按钮
        System.out.println("正确配置下===============================");
        System.out.println(">>>>按下开始按钮<<<<<<");
        box.openButtonPressed();
        System.out.println(">>>>按下重启按钮<<<<<<");
        box.resteButtonPressed();

        //错误配置一次
        box.setOpenCommand(resetCommand);
        box.setResetCommand(openCommand);


        System.out.println("错误配置下==============================");
        System.out.println(">>>>按下开始按钮<<<<<<");
        box.openButtonPressed();
        System.out.println(">>>>按下重启按钮<<<<<<");
        box.resteButtonPressed();


    }
}
