package Controler.Commands;

import CollectionObjects.Person;
import Controler.PersonCreateHelper;
import Controler.ShellPersonParametrs;
import DAO.CollectionManager;

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
    public void execute(String argument) {
        if (argument.isEmpty()) {
            Person person = new PersonCreateHelper(collectionManager, shellPersonParametrs).createPeople();
            collectionManager.addToCollection(person);
        }else{
            System.out.println("Некорректный ввод");
        }
    }
}
