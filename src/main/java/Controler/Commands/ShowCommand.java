package Controler.Commands;

import DAO.CollectionManager;
import Service.ServerEntryPoint;

public class ShowCommand implements Command{

    @Override
    public String getDescription() {
        return getName() + "выводит элементы коллекции";
    }

    @Override
    public String getName() {
        return "show ";
    }

    @Override
    public void execute(){
        ServerEntryPoint.collectionManager.showCollection();
    }
}
