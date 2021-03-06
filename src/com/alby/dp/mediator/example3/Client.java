package com.alby.dp.mediator.example3;

public class Client {
    public static void main(String[] args) {
        DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();

        Dep dep = new Dep();
        dep.setDepId("d1");
        Dep dep2 = new Dep();
        dep2.setDepId("d2");

        User user = new User();
        user.setUserId("u1");

        System.out.println("撤销部门前--------------------------");
        mediator.showUserDeps(user);

        dep.deleteDep();

        System.out.println("撤销部门后--------------------------");
        mediator.showUserDeps(user);


        System.out.println("人员离职前--------------------------");
        mediator.showDepUser(dep2);


        user.dimission();

        System.out.println("人员离职后--------------------------");
        mediator.showDepUser(dep2);

    }
}
