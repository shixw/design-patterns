package com.alby.dp.interpreter.example1;

/**
 * Created by xianwei on 2015/12/20.
 * 抽象表达式
 */
public abstract class AbstractExpression {

    /**
     * 解释的操作
     * @param context 上下文对象
     */
    public abstract void interpret(Context context);
}
