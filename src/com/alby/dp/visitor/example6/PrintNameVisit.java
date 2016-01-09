package com.alby.dp.visitor.example6;

/**
 * Created by xianwei on 2016/1/9.
 * 具体的访问者，实现：输出对象的名称，在组合对象的名称前面添加"节点"
 * 在叶子对象前面添加"叶子"
 */
public class PrintNameVisit implements Visitor {
    @Override
    public void visitComposite(Composite composite) {
        System.out.println("节点："+composite.getName());
    }

    @Override
    public void visitLeaf(Leaf leaf) {
        System.out.println("叶子："+leaf.getName());
    }
}
