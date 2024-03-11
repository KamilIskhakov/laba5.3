package Controler;

import Controler.Commands.*;

import java.util.HashMap;

import DAO.*;
import Controler.*;

public class CommandManager {
    private HashMap<String, Command> commands;

    public CommandManager(IOManager ioManager, ShellPersonParametrs shellPersonParametrs) {
        commands = new HashMap<>();
        commands.put("help", new HelpCommand(ioManager, shellPersonParametrs));
        commands.put("info", new InfoCommand(ioManager));
        commands.put("save", new SaveCommand(ioManager));
        commands.put("show", new ShowCommand(ioManager));
        commands.put("add", new AddCommand(ioManager, shellPersonParametrs));
        commands.put("update", new UpdateCommand(ioManager, shellPersonParametrs));
        commands.put("remove_by_ID", new RemoveByIdCommand(ioManager));
        commands.put("clear", new ClearCommand(ioManager));
        commands.put("execute_script", new ExecuteScriptCommand(ioManager, shellPersonParametrs));
        commands.put("head", new HeadCommand(ioManager));
        commands.put("remove_greater", new RemoveHeadCommand(ioManager));
        /*commands.put("group_counting_by_name", new GroupCountingByNameCommand(ioManager));
        commands.put("filter_greater_than_height", new FilterGreaterThanHeightCommand(ioManager, shellPersonParametrs));
        commands.put("print_less_than_location", new FilterLessThanLocationCommand(ioManager, shellPersonParametrs));*/
        commands.put("exit", new ExitCommand());
    }

    public void execute(String commandName, String arguments) {

        try {
            Command command = commands.get(commandName);
            command.execute(arguments);
            System.out.println("Введите команду: ");
        } catch (NullPointerException exp) {
            System.out.println("Command [" + commandName + "]" + "not found ");
        }
    }
    public HashMap<String, Command> getHashMap(){
        return commands;
    }
}
