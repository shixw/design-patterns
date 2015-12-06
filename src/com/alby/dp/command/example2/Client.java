package com.alby.dp.command.example2;


public class Client {
    public static void main(String[] args) {
        //1：把命令和真正的实现组合起来，相当于在组装机器
        //把机箱上的按钮和连接线插到主板上
        MainBoardApi mainboard = new GigaMainBoard();

        OpenCommand openCommand = new OpenCommand(mainboard);

        //为机箱上的按钮设置对象额命令，让按钮知道该干什么
        Box box = new Box();
        box.setOpenCommand(openCommand);
        //按下开机按钮
        box.openButtonPressed();

    }
}
