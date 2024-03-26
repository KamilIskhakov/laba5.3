package Controler.Commands;

import CollectionObjects.Person;
import Exceptions.GiveParPersonException;
import Exceptions.PersonAskException;

public interface Command {
    String getDescription();
    String getName();
    public void execute();

}
