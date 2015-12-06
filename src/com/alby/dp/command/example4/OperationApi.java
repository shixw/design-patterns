package com.alby.dp.command.example4;

/**
 * Created by xianwei on 2015/12/6.
 *
 */
public interface OperationApi {
    void add(int opeNum);

    void substract(int opeNum);

    int getResult();
    void setResult(int result);
}
