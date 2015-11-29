package com.alby.dp.singleton.example3;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by xianwei on 2015/11/29.
 * 读取应用配置文件
 */
public class APPConfig {
    /**
     * 用来存放配置文件中参数A的值
     */
    private String parameterA;
    /**
     * 用来存放配置文件中参数B的值
     */
    private String parameterB;

    public APPConfig() {
        readConfig();
    }

    /**
     * 读取配置文件，把配置文件的内容读出来设置到属性上
     */
    private void readConfig(){
        Properties p = new Properties();
        InputStream in = null;
        try {
            in = APPConfig.class.getResourceAsStream("APPConfig.properties");
            p.load(in);
            this.parameterA = p.getProperty("paramA");
            this.parameterB = p.getProperty("paramB");
        } catch (IOException e) {
            System.out.println("读取配置文件错误");
            e.printStackTrace();
        }finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public String getParameterA() {
        return parameterA;
    }

    public String getParameterB() {
        return parameterB;
    }
}
