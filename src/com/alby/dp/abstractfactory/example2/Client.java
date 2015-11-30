package com.alby.dp.abstractfactory.example2;

/**
 * Created by xianwei on 2015/11/30.
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        //创建装机工程师对象
        ComputerEngineer ce = new ComputerEngineer();
        //告诉装机工程师自己选择的配件，让装机工程师组装电脑
        ce.makeComputer(1, 2);
    }
}
