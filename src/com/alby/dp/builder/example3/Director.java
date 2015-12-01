package com.alby.dp.builder.example3;

import java.util.Collection;
import java.util.Map;

/**
 * Created by xianwei on 2015/12/1.
 * 指导者
 */
public class Director {
    //持有当前需要使用的构造器对象
    private Builder builder;


    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(ExportHeaderModel ehm,Map<String, Collection<ExportDataModel>> mapData,ExportFooterModel efm){
        builder.buildHeader(ehm);
        builder.buildBody(mapData);
        builder.buildFooter(efm);
    }
}
