package Controler.Handlers;

import Client.Main;
import CollectionObjects.Person;
import Controler.Commands.AddCommand;
import Controler.Commands.Command;
import Exceptions.GiveParPersonException;
import Exceptions.NotCorrectException;
import lombok.Getter;
import lombok.Setter;

public class AddHandler implements Handler{
    @Setter
    private Person person;
    private Command command;
    public void CreateCommand(){
        this.command = new AddCommand(person);
    }
    @Override
    public void handle(String args) throws GiveParPersonException, NotCorrectException {
        if (args == ""){
            throw new GiveParPersonException(this);
        }else{
            throw new NotCorrectException();
        }
    }
    @Override
    public Command getCommand() {
        return command;
    }

}
