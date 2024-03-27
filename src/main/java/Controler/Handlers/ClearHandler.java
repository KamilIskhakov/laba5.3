package Controler.Handlers;

import Controler.Command;
import Controler.Commands.ClearCommand;
import Controler.Commands.InfoCommand;
import Exceptions.NotCorrectException;

public class ClearHandler implements Handler{
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
        this.command = new ClearCommand();
    }

}
