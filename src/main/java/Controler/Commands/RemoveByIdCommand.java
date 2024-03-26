package Controler.Commands;

import Client.Main;
import DAO.CollectionManager;
import Service.ServerEntryPoint;

public class RemoveByIdCommand implements Command{
    private Integer argument;
    @Override
    public String getDescription() {
        return getName() + "удаляет элемент очереди по айди";
    }

    @Override
    public String getName() {
        return "remove_by_id ";
    }

    @Override
    public void execute() {
        ServerEntryPoint.collectionManager.removeCollectionById(argument);
    }
}
