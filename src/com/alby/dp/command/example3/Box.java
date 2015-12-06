package com.alby.dp.command.example3;

public class Box {
    private Command openCommand = null;

    public void setOpenCommand(Command command) {
        this.openCommand = command;
    }


    public void openButtonPressed() {
        openCommand.execute();
    }


    private Command resetCommand = null;

    public void setResetCommand(Command resetCommand) {
        this.resetCommand = resetCommand;
    }

    public void resteButtonPressed(){
        this.resetCommand.execute();
    }
}
