package Controler.Commands;

import Controler.CommandManager;
import DAO.ShellPersonParametrs;
import DAO.CollectionManager;

import java.util.HashMap;

public class HelpCommand implements Command{
    private CollectionManager collectionManager;
    private ShellPersonParametrs shellPersonParametrs;
    public HelpCommand(CollectionManager collectionManager, ShellPersonParametrs shellPersonParametrs) {
        this.collectionManager = collectionManager;
        this.shellPersonParametrs = shellPersonParametrs;
    }

    @Override
    public String getDescription() {
        return getName() + "вывести справку по доступным командам";
    }

    @Override
    public String getName() {
        return "help ";
    }

    @Override
    public void execute(String argument) {
        if (argument.isEmpty()){
            HashMap<String,Command> com = new CommandManager(collectionManager,shellPersonParametrs).getHashMap();
            for (String command : com.keySet()){
                Command item = com.get(command);
                System.out.println(item.getDescription());
            }
        }else {
            System.out.println("Некорректный ввод");
        }
    }
}
