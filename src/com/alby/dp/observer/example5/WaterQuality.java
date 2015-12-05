package com.alby.dp.observer.example5;

/**
 * Created by xianwei on 2015/12/5.
 *
 */
public class WaterQuality extends WaterQualitySubject {

    private int polluteLevel = 0;
    @Override
    public int getPolluteLevel() {
        return this.polluteLevel;
    }

    public void setPolluteLevel(int polluteLevel) {
        this.polluteLevel = polluteLevel;
        this.notifyWatchers();
    }

    public void notifyWatchers(){
        for (WatcherObserver watcher : observers){
            if (this.polluteLevel >= 0){
                if ("监测人员".equals(watcher.getJob())){
                    watcher.update(this);
                }
            }
            if (this.polluteLevel >= 1){
                if ("预警人员".equals(watcher.getJob())){
                    watcher.update(this);
                }
            }
            if (this.polluteLevel >= 2){
                if ("监测部门领导".equals(watcher.getJob())){
                    watcher.update(this);
                }
            }
        }
    }
}
