package com.alby.dp.factorymethod.example7;

/**
 * Created by xianwei on 2015/11/29.
 * 导出文件对象的接口
 */
public interface ExportFileApi {
    /**
     * 导出内容为文件
     * @param data  需要保存的数据
     * @return  是否导出成功
     */
    public boolean export(String data);
}
