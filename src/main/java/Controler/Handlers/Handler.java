package Controler.Handlers;

import Exceptions.GiveParPersonException;

public interface Handler {
    public void handle(String args) throws GiveParPersonException;
}
