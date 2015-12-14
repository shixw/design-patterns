package com.alby.dp.state.example3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xianwei on 2015/12/14.
 * 投票管理
 */
public class VoteManager {

    //持有状态处理的对象
    private VoteState state = null;

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
        if (oldVoteCount==1){
//            state = new NormalVoteState();
            state = new NormalVoteState2();
        }else if (oldVoteCount>1 && oldVoteCount<5){
            state = new RepeatVoteState();
        }else if (oldVoteCount>=5 && oldVoteCount<8){
            state = new SpiteVoteState();
        }else if (oldVoteCount>=8){
            state = new BlackVoteState();
        }
        //然后转调状态对象进行相应的操作
        state.vote(user,voteItem,this);
    }
}
