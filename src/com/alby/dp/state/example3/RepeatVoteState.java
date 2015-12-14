package com.alby.dp.state.example3;

/**
 * Created by xianwei on 2015/12/14.
 *
 */
public class RepeatVoteState implements VoteState{
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("请不要重复投票");
    }
}
