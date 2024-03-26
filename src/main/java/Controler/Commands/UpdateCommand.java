package Controler.Commands;

import CollectionObjects.Person;
import DAO.CollectionManager;
import Service.ServerEntryPoint;

public class UpdateCommand implements Command{
    private Integer argument;
    private Person person;
    @Override
    public String getDescription() {
        return getName() + "заменяет на новый объект по айди";
    }

    @Override
    public String getName() {
        return "update ";
    }

    @Override
    public void execute() {
        ServerEntryPoint.collectionManager.update(person,argument);
    }
}
