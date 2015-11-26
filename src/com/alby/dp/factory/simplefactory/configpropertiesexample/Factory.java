package com.alby.dp.factory.simplefactory.configpropertiesexample;

import com.alby.dp.factory.simplefactory.Api;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by xianwei on 2015/11/26.
 * 读取配置文件的工厂类
 */
public class Factory {
    /**
     * 具体的创造Api的方法，根据配置文件的参数来创建接口
     * @return 返回实例
     */
    public static Api createApi(){
        //直接读取配置文件来获取需要创建的类的实例

        Properties properties = new Properties();
        InputStream in = null;
        try {
            in = Factory.class.getResourceAsStream("FactoryTest.properties");
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (in!=null)
                    in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //使用反射创建
        Api api = null;
        try {
            api = (Api)Class.forName(properties.getProperty("ImplClass")).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return api;
    }
}
