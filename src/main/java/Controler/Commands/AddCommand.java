package Controler.Commands;

import CollectionObjects.Person;
import DAO.PersonAskManager;
import Exceptions.GiveParPersonException;
import DAO.ShellPersonParametrs;
import DAO.CollectionManager;
import Exceptions.PersonAskException;

public class AddCommand implements Command {
    private CollectionManager collectionManager;
    private ShellPersonParametrs shellPersonParametrs;
    private Person person;

    public AddCommand(Person person){
        this.person = person;
    }
    @Override
    public String getDescription() {
        return getName() + "добавляет новый объект в конец коллекции";
    }

    @Override
    public String getName() {
        return "add ";
    }

    @Override
    public void execute(String command) throws GiveParPersonException{
        try{
        if (command.isEmpty()) {
            Person person = new PersonAskManager().createPerson();
            collectionManager.addToCollection(person);
        }else{
                System.out.println("Некорректный ввод");
            }
        }catch(GiveParPersonException e){
                throw e;
        }
    }
}
