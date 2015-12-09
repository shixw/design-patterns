package com.alby.dp.templatemethed.example7;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        UserModel um1 = new UserModel("u1","user1",23);
        UserModel um2 = new UserModel("u2","user2",24);
        UserModel um3 = new UserModel("u3","user3",25);
        UserModel um4 = new UserModel("u4","user4",26);

        List<UserModel> list = new ArrayList<UserModel>();
        list.add(um1);
        list.add(um2);
        list.add(um3);
        list.add(um4);

        System.out.println("排序前----------------------------------");
        printList(list);
//返回  正数为  前>后    0为 前=后  负数为 前<后
        Comparator<UserModel> c = new Comparator<UserModel>() {
            @Override
            public int compare(UserModel o1, UserModel o2) {
                if (o1.getAge()> o2.getAge()){
                    return 1;
                }else if (o1.getAge()< o2.getAge()){
                    return -1;
                }else {
                    return 0;
                }
            }
        };

        Collections.sort(list,c);
        System.out.println("排序后----------------------------------");
        printList(list);
    }


    private static void printList(List<UserModel> list) {
        for (UserModel userModel : list) {
            System.out.println(userModel);
        }
    }
}
