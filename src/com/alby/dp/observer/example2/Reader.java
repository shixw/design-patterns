package com.alby.dp.observer.example2;

/**
 * Created by xianwei on 2015/12/5.
 * 真正的读者，
 */
public class Reader implements Observer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject reader) {
        //这是采用拉的方式
        System.out.println(name + "收到报纸了，阅读先。内容是=====" + ((NewsPaper) reader).getContent());
    }
}
