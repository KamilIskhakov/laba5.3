package Controler.Commands;

import CollectionObjects.Person;
import Service.PersonCreateHelper;
import DAO.ShellPersonParametrs;
import DAO.CollectionManager;

public class UpdateCommand implements Command{
    private CollectionManager collectionManager;
    private ShellPersonParametrs shellPersonParametrs;
    public UpdateCommand(CollectionManager collectionManager, ShellPersonParametrs shellPersonParametrs){
        this.collectionManager = collectionManager;
        this.shellPersonParametrs = shellPersonParametrs;
    }
    @Override
    public String getDescription() {
        return getName() + "заменяет на новый объект по айди";
    }

    @Override
    public String getName() {
        return "update ";
    }

    @Override
    public void execute(String argument) {
        if (!argument.isEmpty()) {
            Integer id = Integer.parseInt(argument);
            Person person = new PersonCreateHelper(collectionManager,shellPersonParametrs).createPeople();
            collectionManager.update(person,id);
        }
        else{
            System.out.println("Некорректный ввод");
        }
    }
}
