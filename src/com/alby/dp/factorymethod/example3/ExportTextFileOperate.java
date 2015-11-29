package com.alby.dp.factorymethod.example3;

/**
 * Created by xianwei on 2015/11/29.
 * 具体的创建器实现对象，实现创建导出成文本文件的形式的对象
 */
public class ExportTextFileOperate extends ExportOperate{
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportTxtFile();
    }
}
