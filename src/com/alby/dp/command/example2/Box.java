package com.alby.dp.command.example2;

public class Box {
    private Command command = null;

    public void setOpenCommand(Command command) {
        this.command = command;
    }


    public void openButtonPressed() {
        command.execute();
    }
}
