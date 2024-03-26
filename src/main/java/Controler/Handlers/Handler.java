package Controler.Handlers;

import Controler.Commands.Command;
import Exceptions.GiveParPersonException;
import Exceptions.NotCorrectException;

public interface Handler {
    public void handle(String args) throws GiveParPersonException, NotCorrectException;
    public Command getCommand();
}
