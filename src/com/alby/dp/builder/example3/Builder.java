package com.alby.dp.builder.example3;

import java.util.Collection;
import java.util.Map;

/**
 * Created by xianwei on 2015/12/1.
 * 构造器接口，定义创建一个输出文件对象所需的各个部件的操作
 */
public interface Builder {

    public void buildHeader(ExportHeaderModel ehm);

    public void buildBody(Map<String,Collection<ExportDataModel>> mapData);

    public void buildFooter(ExportFooterModel efm);
}
