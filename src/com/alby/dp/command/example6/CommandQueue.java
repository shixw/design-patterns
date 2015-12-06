package com.alby.dp.command.example6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianwei on 2015/12/6.
 * 命令队列类
 */
public class CommandQueue {
    /**
     * 用来存储命令对象的队列
     * 请注意：这里没有使用java.util.Queue，是因为常用的实现Queue接口的LinkedList类要求存放的对象是可排序的，
     * 排序是使用的Comparator，这跟要演示的功能没有多大关系，反而会增加复杂性。
     * 另外一个需要的功能是把命令对象按照先后顺序排好就可以了，只要是有序的就可以了。
     * 因此为了演示的简洁性，就直接使用List了。
     */
    private static List<Command> cmds = new ArrayList<Command>();

    public synchronized static void addMenu(MenuCommand menu){
        for (Command cmd : menu.getCommands()){
            cmds.add(cmd);
        }
    }

    public synchronized static Command getOneCommand(){
        Command cmd = null;
        if (cmds.size()>0){
            cmd = cmds.get(0);
            cmds.remove(0);
        }
        return cmd;
    }
}

