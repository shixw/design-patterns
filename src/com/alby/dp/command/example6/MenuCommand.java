package com.alby.dp.command.example6;


import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by xianwei on 2015/12/6.
 * 菜单对象，是个宏命令对象
 */
public class MenuCommand implements Command {

    private Collection<Command> col = new ArrayList<Command>();
    public void addCommand(Command command){
        col.add(command);
    }
    @Override
    public void execute() {
        CommandQueue.addMenu(this);
    }

    public Collection<Command> getCommands() {
        return col;
    }

    @Override
    public void setCookApi(CookApi cookApi) {
        
    }

    @Override
    public int getTableNum() {
        return 0;
    }
}
