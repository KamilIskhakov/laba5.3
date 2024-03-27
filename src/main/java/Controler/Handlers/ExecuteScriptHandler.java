package Controler.Handlers;

import Controler.Command;
import Controler.Commands.ExecuteScriptCommand;
import Exceptions.NotCorrectException;

public class ExecuteScriptHandler implements Handler{
    private Command command;
    private String filepath;
    @Override
    public void handle(String args) throws NotCorrectException {
        if (args != ""){
            filepath = args;
            CreateCommand();
        }else{
            throw new NotCorrectException();
        }
    }

    @Override
    public Command getCommand() {
        return command;
    }

    @Override
    public void CreateCommand() {
        this.command = new ExecuteScriptCommand(filepath);
    }
}
