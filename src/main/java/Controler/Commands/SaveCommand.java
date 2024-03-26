package Controler.Commands;

import DAO.CollectionManager;
import Service.ServerEntryPoint;

public class SaveCommand implements Command{

    @Override
    public String getDescription() {
        return getName() + "сохраняет все изменения в коллекции";
    }

    @Override
    public String getName() {
        return "save ";
    }

    @Override
    public void execute() {
        ServerEntryPoint.collectionManager.save();
    }
}
