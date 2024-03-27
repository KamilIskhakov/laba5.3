package Controler.Handlers;

import Controler.Command;
import Controler.Commands.FilterGreaterThanHeightCommand;
import Controler.Commands.GroupCountingByNameCommand;
import Exceptions.NotCorrectException;

public class FilterGreaterThanHeightHandler implements Handler{
    private Integer height;
    private Command command;
    @Override
    public void handle(String args) throws NotCorrectException {
        if (args != ""){
            try{
                height = Integer.parseInt(args);
            }catch (Exception e){
                throw new NotCorrectException();
            }
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
        this.command = new FilterGreaterThanHeightCommand(height);
    }
}
