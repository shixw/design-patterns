package com.alby.dp.singleton.example4;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by xianwei on 2015/11/29.
 * 读取应用配置文件，单例实现   饿汉式
 */
public class APPConfig {
    /**
     * 定义一个变量来存储创建好的类实例，直接在这里创建实例，只会创建一次
     */
    private static APPConfig instance = new APPConfig();

    /**
     * 定义一个方法来为客户端提供APPConfig类的实例
     * @return appconfig 实例
     */
    public static APPConfig getInstance() {
        return instance;
    }

    /**
     * 用来存放配置文件中参数A的值
     */
    private String parameterA;
    /**
     * 用来存放配置文件中参数B的值
     */
    private String parameterB;

    private APPConfig() {
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
            System.out.println("=========读取配置文件===========");
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
