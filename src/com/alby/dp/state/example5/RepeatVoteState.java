package com.alby.dp.state.example5;


/**
 * Created by xianwei on 2015/12/14.
 *
 */
public class RepeatVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("请不要重复投票");

        //重复投票完成，维护下一个状态，重复投票到5次，就算恶意投票了

        if (voteManager.getMapVoteCount().get(user)>=4){
            voteManager.getMapState().put(user,new SpiteVoteState());
            //直接把下一个状态的编码记录人数据库就好了
        }
    }
}
