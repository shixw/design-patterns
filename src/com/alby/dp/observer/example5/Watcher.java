package com.alby.dp.observer.example5;

/**
 * Created by xianwei on 2015/12/5.
 */
public class Watcher implements WatcherObserver {
    private String job;

    @Override
    public String getJob() {
        return this.job;
    }

    @Override
    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void update(WaterQualitySubject waterQuality) {
        System.out.println(job + "获取到通知，当前污染级别为：" + waterQuality.getPolluteLevel());
    }
}
