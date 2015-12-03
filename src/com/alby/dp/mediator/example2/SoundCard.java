package com.alby.dp.mediator.example2;

/**
 * Created by xianwei on 2015/12/3.
 * 声卡类，一个同事类
 */
public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void soundData(String data){
        System.out.println("画外音："+data);
    }
}
