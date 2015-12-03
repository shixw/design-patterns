package com.alby.dp.mediator.example2;

public class Client {
    public static void main(String[] args) {
        //创建中介者
        MotherBoard mediator = new MotherBoard();
        //创建同事类
        CDDriver cd = new CDDriver(mediator);
        CPU cpu = new CPU(mediator);
        VideoCard vc = new VideoCard(mediator);
        SoundCard sc = new SoundCard(mediator);

        //让中介者知道所有的同事

        mediator.setCdDriver(cd);
        mediator.setCpu(cpu);
        mediator.setSoundCard(sc);
        mediator.setVideoCard(vc);
//开始看电影，放入光盘
        cd.readCD();

    }
}
