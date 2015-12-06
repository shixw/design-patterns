package com.alby.dp.command.example4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianwei on 2015/12/6.
 * 计算器类
 */
public class Calculator {

    //命令操作的历史记录，在撤销的时候用
    private List<Command> undoCmds = new ArrayList<Command>();
    //命令撤销的历史记录，在恢复的时候用
    private List<Command> redoCmds = new ArrayList<Command>();

    private Command addCmd = null;
    private Command substractCmd = null;

    public void undoPressed(){
        if (undoCmds.size()>0){
            Command cmd = this.undoCmds.get(this.undoCmds.size()-1);
            cmd.undo();

            this.redoCmds.add(cmd);
            this.undoCmds.remove(cmd);
        }else {
            System.out.println("很抱歉，没有可以撤销的命令");
        }
    }
    public void redoPressed(){
        if (redoCmds.size()>0){
            Command cmd = this.redoCmds.get(this.redoCmds.size()-1);
            cmd.execute();

            this.undoCmds.add(cmd);
            this.redoCmds.remove(cmd);
        }else {
            System.out.println("很抱歉，没有可以恢复的命令");
        }
    }
    public void substractPressed(){
        this.substractCmd.execute();
        undoCmds.add(this.substractCmd);
    }
    public void addPressed(){
        this.addCmd.execute();
        undoCmds.add(this.addCmd);
    }

    public void setAddCmd(Command addCmd) {
        this.addCmd = addCmd;
    }

    public void setSubstractCmd(Command substractCmd) {
        this.substractCmd = substractCmd;
    }
}
