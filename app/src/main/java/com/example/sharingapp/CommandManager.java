package com.example.sharingapp;

public class CommandManager {
    private CommandManager instance;

    private CommandManager(){

    }

    public CommandManager getInstance(){
        if(this.instance == null){
            this.instance = new CommandManager();
        }
        return this.instance;
    }

    public void invokeCommand(Command command){
        command.execute();
    }
}
