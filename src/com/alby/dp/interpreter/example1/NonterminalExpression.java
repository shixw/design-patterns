package com.alby.dp.interpreter.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianwei on 2015/12/20.
 * 非终结符的表达式
 * 相当于组合对象
 */
public class NonterminalExpression extends AbstractExpression {
    //子组件
    private List<AbstractExpression> list = new ArrayList<AbstractExpression>();

    @Override
    public void interpret(Context context) {
        //实现与语法规则中的非终结符相关联的解释操作
    }

    public void addAbstractExpression(AbstractExpression abstractExpression) {
        list.add(abstractExpression);
    }
}
