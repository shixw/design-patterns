package com.alby.dp.observer.example5;

/**
 * Created by xianwei on 2015/12/5.
 *
 */
public interface WatcherObserver {
    String getJob();

    void setJob(String job);

    void update(WaterQualitySubject waterQuality);
}
