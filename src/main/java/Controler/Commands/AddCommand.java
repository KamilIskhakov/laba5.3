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
    public AddCommand(CollectionManager collectionManager, ShellPersonParametrs shellPersonParametrs){
        this.collectionManager = collectionManager;
        this.shellPersonParametrs = shellPersonParametrs;
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
    public void execute(String command) throws PersonAskException{
        try{
        if (command.isEmpty()) {
            Person person = new PersonAskManager().createPerson();
            collectionManager.addToCollection(person);
        }else{
                System.out.println("Некорректный ввод");
            }
        }catch(GiveParPersonException e){
                throw new PersonAskException(e.getParName());
        }
    }
}
