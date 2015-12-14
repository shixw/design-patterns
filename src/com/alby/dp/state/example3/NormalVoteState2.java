package com.alby.dp.state.example3;

public class NormalVoteState2 extends  NormalVoteState{
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        super.vote(user, voteItem, voteManager);
        //给予积分奖励
        System.out.println("奖励积分10分");
    }
}
