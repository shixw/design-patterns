package com.alby.dp.mediator.example2;

/**
 * Created by xianwei on 2015/12/3.
 * 主板类，实现中介者接口
 */
public class MotherBoard implements Mediator {
    private CDDriver cdDriver = null;
    private CPU cpu = null;
    private VideoCard videoCard = null;
    private SoundCard soundCard = null;

    public void setCdDriver(CDDriver cdDriver) {
        this.cdDriver = cdDriver;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public void changed(Colleague colleague) {
        if (colleague == cdDriver){
            this.openCDDriverReadData((CDDriver)colleague);
        }else if (colleague == cpu){
            this.openCPU((CPU)colleague);
        }
    }

    private void openCPU(CPU cp) {
        String videoData = cp.getVideoData();
        String soundData = cp.getSoundData();

        this.videoCard.showData(videoData);
        this.soundCard.soundData(soundData);
    }

    private void openCDDriverReadData(CDDriver cd) {
        //1：先获取光驱读取的数据
        String data = cd.getData();
        //2：将数据传递给CPU进行处理
        this.cpu.executeData(data);
    }


}
