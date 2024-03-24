package Service;

import Client.Main;
import CollectionObjects.Person;
import DAO.CollectionManager;
import DAO.ShellPersonParametrs;
import Exceptions.PersonAskException;

public class PersonCreateHelper {
    private ShellPersonParametrs shellPersonParametrs;
    private CollectionManager collectionManager;
    public PersonCreateHelper(CollectionManager collectionManager, ShellPersonParametrs shellPersonParametrs){
        this.collectionManager = collectionManager;
        this.shellPersonParametrs = shellPersonParametrs;
    }
    public Person createPeople() throws PersonAskException {

    }
}
