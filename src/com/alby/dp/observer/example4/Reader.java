package com.alby.dp.observer.example4;


import java.util.Observable;
import java.util.Observer;

/**
 * Created by xianwei on 2015/12/5.
 * 读者
 */
public class Reader implements Observer{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object obj) {
        System.out.println(name + "收到报纸了，阅读先。目标推送过来的内容是=====" + obj);

        System.out.println(name + "收到报纸了，阅读先。主动到目标对象去拉来的内容是=====" +((NewsPaper)o).getContent());
    }
}
