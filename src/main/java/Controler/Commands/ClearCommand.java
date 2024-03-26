package Controler.Commands;

import Client.Main;
import DAO.CollectionManager;
import Service.ServerEntryPoint;

public class ClearCommand implements Command{

    @Override
    public String getDescription() {
        return getName() + "очищает коллекцию";
    }

    @Override
    public String getName() {
        return "clear ";
    }

    @Override
    public void execute() {
        ServerEntryPoint.collectionManager.clear();
    }
}
