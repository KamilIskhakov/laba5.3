package Controler.Handlers;

import Client.Main;
import CollectionObjects.Person;
import Controler.Commands.AddCommand;
import Controler.Commands.Command;
import Exceptions.GiveParPersonException;
import lombok.Setter;

public class AddHandler implements Handler{
    @Setter
    private Person person;
    private Command command;
    @Override
    public void handle(String args) throws GiveParPersonException{
        if (args == ""){
            throw new GiveParPersonException(this);
            this.command = new AddCommand();
        }else{
            Main.terminalOutputManager.println("");
        }
    }

}
