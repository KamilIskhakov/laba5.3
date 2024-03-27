package Controler.Handlers;

import Controler.Command;
import Controler.Commands.RemoveHeadCommand;
import Controler.Handlers.Handler;
import Exceptions.NotCorrectException;

public class RemoveHeadHandler implements Handler {
    private Command command;
    @Override
    public void handle(String args) throws NotCorrectException {
        if (args == ""){
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
        this.command = new RemoveHeadCommand();
    }
}
