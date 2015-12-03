package com.alby.dp.mediator.example2;

/**
 * Created by xianwei on 2015/12/3.
 * 显卡类，一个同事类
 */
public class VideoCard extends Colleague {
    public VideoCard(Mediator mediator) {
        super(mediator);
    }

    public void showData(String data){
        System.out.println("您正在观看的是："+data);
    }
}
