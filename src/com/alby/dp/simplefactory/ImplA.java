package com.alby.dp.simplefactory;

/**
 * Created by xianwei on 2015/11/26.
 * 接口的具体实现对象A
 */
public class ImplA  implements Api{
    @Override
    public void operation(String s) {
        //实现功能的代码
        System.out.println("ImplA s = [" + s + "]");
    }
}
