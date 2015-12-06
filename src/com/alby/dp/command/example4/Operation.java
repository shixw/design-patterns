package com.alby.dp.command.example4;

/**
 * Created by xianwei on 2015/12/6.
 *
 */
public class Operation implements OperationApi{
    private int result = 0;
    @Override
    public void add(int opeNum) {
        result += opeNum;
    }

    @Override
    public void substract(int opeNum) {
        result -= opeNum;
    }

    @Override
    public int getResult() {
        return result;
    }

    @Override
    public void setResult(int result) {
        this.result = result;
    }
}
