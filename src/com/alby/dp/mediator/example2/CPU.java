package com.alby.dp.mediator.example2;

/**
 * Created by xianwei on 2015/12/3.
 * CPU类，一个同事类
 */
public class CPU extends Colleague {
    public CPU(Mediator mediator) {
        super(mediator);
    }

    private String videoData = "";

    private String soundData = "";

    public String getVideoData(){
        return videoData;
    }

    public String getSoundData() {
        return soundData;
    }

    public void executeData(String data){
        String[] ss = data.split(",");
        this.soundData = ss[0];
        this.videoData = ss[1];
        //通知主板CPU的工作完成
        this.getMediator().changed(this);
    }
}
