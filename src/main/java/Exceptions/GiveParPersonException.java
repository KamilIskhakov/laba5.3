package Exceptions;

import CollectionObjects.Person;
import Controler.Handlers.AddHandler;

public class GiveParPersonException extends Exception {
    private AddHandler addHandler;
    public GiveParPersonException(AddHandler addHandler){
        this.addHandler = addHandler;
    }

    public String getMessage() {
            return "недостаточно параметров для создания Person";
        }
    public void setPersonCom(Person person) {
        addHandler.setPerson(person);
    }

}
