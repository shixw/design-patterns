package com.alby.dp.facade.example1;

/**
 * Created by xianwei on 2015/11/27.
 *  配置描述数据的Model，真是配置数据会很多
 */
public class ConfigModel {
    /**
     * 是否生成变现曾
     */
    private boolean needGenPresentation = true;
    /**
     * 是否生成逻辑层
     */
    private boolean needGenBusiness = true;
    /**
     * 是否生成Dao

     */
    private boolean needGenDao = true;

    public void setNeedGenBusiness(boolean needGenBusiness) {
        this.needGenBusiness = needGenBusiness;
    }

    public void setNeedGenPresentation(boolean needGenPresentation) {
        this.needGenPresentation = needGenPresentation;
    }

    public void setNeedGenDao(boolean needGenDao) {
        this.needGenDao = needGenDao;
    }


    public boolean isNeedGenPresentation() {
        return true;
    }

    public boolean isNeedGenBusiness() {
        return true;
    }

    public boolean isNeedGenDao() {
        return true;
    }
}
