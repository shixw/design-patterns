package com.alby.dp.state.example4;


public class BlackVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //黑名单
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }
}
