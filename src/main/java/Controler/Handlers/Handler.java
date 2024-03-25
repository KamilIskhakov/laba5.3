package Controler.Handlers;

import Exceptions.GiveParPersonException;
import Exceptions.NotCorrectException;

public interface Handler {
    public void handle(String args) throws GiveParPersonException, NotCorrectException;
}
