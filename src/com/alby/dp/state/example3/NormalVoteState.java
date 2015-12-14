package com.alby.dp.state.example3;

/**
 * Created by xianwei on 2015/12/14.
 *
 */
public class NormalVoteState implements VoteState{
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        voteManager.getMapVote().put(user,voteItem);
        System.out.println("恭喜你投票成功");
    }
}
