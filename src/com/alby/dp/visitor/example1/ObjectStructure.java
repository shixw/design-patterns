package com.alby.dp.visitor.example1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by xianwei on 2016/1/9.
 * 对象结构，通常在这里对元素对象进行遍历，让访问者能访问到所有的元素
 */
public class ObjectStructure {
    //表示对象结构，可以是一个组合结构或是集合
    private Collection<Element> col = new ArrayList<Element>();

    //提供给客户端操作的高层接口
    public void handleRequest(Visitor visitor){
        for (Element element : col) {
            element.accept(visitor);
        }
    }

    /**
     * 组建对象结构，向对象结构中添加元素
     * 不同的对象机构有不同的构建方式
     * @param element 加入到对象接口的元素
     */
    public void addElement(Element element){
        col.add(element);
    }
}
