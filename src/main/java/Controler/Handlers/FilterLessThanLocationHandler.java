package Controler.Handlers;

import Client.Main;
import CollectionObjects.Location;
import CollectionObjects.Person;
import Controler.Command;
import Controler.Commands.AddCommand;
import Controler.Commands.FilterLessThanLocationCommand;
import Exceptions.NotCorrectException;

public class FilterLessThanLocationHandler implements Handler{
    private Location location;
    private Command command;

    @Override
    public void CreateCommand(){
        this.command = new FilterLessThanLocationCommand(location);
    }
    @Override
    public void handle(String args) throws NotCorrectException {
        if (args == ""){
            this.location = Main.terminalManager.MakeMeLocation();
            CreateCommand();
        }else{
            throw new NotCorrectException();
        }
    }
    @Override
    public Command getCommand() {
        return command;
    }
}
