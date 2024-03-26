package Controler.Commands;

import Client.Main;
import DAO.CollectionManager;
import Service.ServerEntryPoint;

public class HeadCommand implements Command{

    @Override
    public String getDescription() {
        return getName() + "выводит первый элемент очереди";
    }

    @Override
    public String getName() {
        return "head ";
    }

    @Override
    public void execute() {
      Main.terminalOutputManager.println(ServerEntryPoint.collectionManager.showHead());
    }
}
