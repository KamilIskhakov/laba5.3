package Controler.Commands;

import Controler.CommandManager;
import Controler.ShellPersonParametrs;
import DAO.IOManager;

import java.util.HashMap;

public class HelpCommand implements Command{
    private IOManager ioManager;
    private ShellPersonParametrs shellPersonParametrs;
    public HelpCommand(IOManager ioManager, ShellPersonParametrs shellPersonParametrs) {
        this.ioManager = ioManager;
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
        HashMap<String,Command> com = new CommandManager(ioManager,shellPersonParametrs).getHashMap();
        for (String command : com.keySet()){
            Command item = com.get(command);
            System.out.println(item.getDescription());
        }
    }
}
