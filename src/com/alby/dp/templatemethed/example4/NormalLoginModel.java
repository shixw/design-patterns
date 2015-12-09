package com.alby.dp.templatemethed.example4;

/**
 * Created by xianwei on 2015/12/9.
 * 封装进行登录控制所需要的数据
 * 在公共数据上添加具体模块需要的数据
 */
public class NormalLoginModel extends LoginModel {
    //问题
    private String question;

    //答案
    private String answer;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
