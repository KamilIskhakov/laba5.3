package Controler.Commands;

import Controler.CommandRequestManager;
import DAO.CollectionManager;

import java.util.HashMap;

public class HelpCommand implements Command{

    @Override
    public String getDescription() {
        return getName() + "вывести справку по доступным командам";
    }

    @Override
    public String getName() {
        return "help ";
    }

    @Override
    public void execute() {
        HashMap<String,Command> com = new CommandRequestManager(collectionManager,shellPersonParametrs).getHashMap();
        for (String command : com.keySet()){
            Command item = com.get(command);
            System.out.println(item.getDescription());
        }
    }
}
