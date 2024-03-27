package Controler.Handlers;

import Controler.Command;
import Exceptions.NotCorrectException;

public interface Handler {
    public void handle(String args) throws NotCorrectException;
    public Command getCommand();
    public void CreateCommand();
}
