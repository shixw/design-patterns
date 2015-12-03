package com.alby.dp.mediator.example3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by xianwei on 2015/12/3.
 * 实现部门和人员交互的中介者实现类
 * 说明：只示例实现撤销部门和人员离职的功能
 */
public class DepUserMediatorImpl {
    private static DepUserMediatorImpl mediator = new DepUserMediatorImpl();

    private DepUserMediatorImpl() {
        //调用初始化测试数据的功能
        initTestData();
    }

    private void initTestData() {
        DepUserModel du1 = new DepUserModel();
        du1.setDepUserId("du1");
        du1.setDepId("d1");
        du1.setUserId("u1");
        depUserCol.add(du1);

        DepUserModel du2 = new DepUserModel();
        du2.setDepUserId("du2");
        du2.setDepId("d1");
        du2.setUserId("u2");
        depUserCol.add(du2);

        DepUserModel du3 = new DepUserModel();
        du3.setDepUserId("du3");
        du3.setDepId("d2");
        du3.setUserId("u3");
        depUserCol.add(du3);

        DepUserModel du4 = new DepUserModel();
        du4.setDepUserId("du4");
        du4.setDepId("d2");
        du4.setUserId("u4");
        depUserCol.add(du4);

        DepUserModel du5 = new DepUserModel();
        du5.setDepUserId("du5");
        du5.setDepId("d2");
        du5.setUserId("u1");
        depUserCol.add(du5);

    }


    public void showDepUser(Dep dep){
        for (DepUserModel du : depUserCol){
            if(du.getDepId().equals(dep.getDepId())){
                System.out.println("部门编号="+dep.getDepId()+" 下面拥有人员，其编号为："+du.getUserId());
            }
        }
    }
    public void showUserDeps(User user){
        for (DepUserModel du : depUserCol){
            if(du.getUserId().equals(user.getUserId())){
                System.out.println("人员编号="+user.getUserId()+" 属于部门编号为："+du.getDepId());
            }
        }
    }
    public boolean deleteUser(String userId){
        Collection<DepUserModel> tempCol = new ArrayList<DepUserModel>();
        for (DepUserModel du : depUserCol){
            if (du.getUserId().equals(userId)){
                tempCol.add(du);
            }
        }

        depUserCol.removeAll(tempCol);

        return true;
    }
    /**
     * 完成撤销部门的操作所引起的与人员的交互，需要去除相应的关系
     * @param depId 撤销部门的ID
     * @return 是否已正确处理
     */
    public boolean deleteDep(String depId){
        Collection<DepUserModel> tempCol = new ArrayList<DepUserModel>();
        for (DepUserModel du : depUserCol){
            if (du.getDepId().equals(depId)){
                tempCol.add(du);
            }
        }

        depUserCol.removeAll(tempCol);

        return true;
    }
    public static DepUserMediatorImpl getInstance(){
        return mediator;
    }

    //记录部门和人员的关系
    private Collection<DepUserModel> depUserCol = new ArrayList<DepUserModel>();
}
