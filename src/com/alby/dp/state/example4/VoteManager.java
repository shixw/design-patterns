package com.alby.dp.state.example4;



import java.util.HashMap;
import java.util.Map;

/**
 * Created by xianwei on 2015/12/14.
 * 投票管理
 */
public class VoteManager {

    /**
     * 记录当前每个用户对应的状态处理对象，每个用户当前的状态是不用的
     */
    private Map<String,VoteState> mapState = new HashMap<String, VoteState>();

    public Map<String, Integer> getMapVoteCount() {
        return mapVoteCount;
    }

    public Map<String, VoteState> getMapState() {
        return mapState;
    }


    //记录用户投票的结果，Map<String,String>对应Map<用户名,投票选项>
    private Map<String,String> mapVote = new HashMap<String, String>();

    //记录用户投票次数，Map<String,Integer> 对应 Map<用户名,投票的次数>
    private Map<String,Integer> mapVoteCount = new HashMap<String, Integer>();

    public Map<String, String> getMapVote() {
        return mapVote;
    }

    //投票
    public void vote(String user,String voteItem){
        //记录用户增加投票的次数
        Integer oldVoteCount = mapVoteCount.get(user);
        if (oldVoteCount==null){
            oldVoteCount = 0;
        }
        oldVoteCount = oldVoteCount + 1;

        mapVoteCount.put(user,oldVoteCount);

        //判断用户投票的类型，就相当于是判断对应的状态
        VoteState state = mapState.get(user);
        if (state == null){
            state = new NormalVoteState();
        }
        //然后转调状态对象进行相应的操作
        state.vote(user,voteItem,this);
    }
}
