package Controler;

import Controler.Commands.*;

import java.util.HashMap;

import DAO.*;

public class CommandManager {
    private HashMap<String, Command> commands;

    public CommandManager(CollectionManager collectionManager, ShellPersonParametrs shellPersonParametrs) {
        commands = new HashMap<>();
        commands.put("help", new HelpCommand(collectionManager, shellPersonParametrs));
        commands.put("info", new InfoCommand(collectionManager));
        commands.put("save", new SaveCommand(collectionManager));
        commands.put("show", new ShowCommand(collectionManager));
        commands.put("add", new AddCommand(collectionManager, shellPersonParametrs));
        commands.put("update", new UpdateCommand(collectionManager, shellPersonParametrs));
        commands.put("remove_by_ID", new RemoveByIdCommand(collectionManager));
        commands.put("clear", new ClearCommand(collectionManager));
        commands.put("execute_script", new ExecuteScriptCommand(collectionManager, shellPersonParametrs));
        commands.put("head", new HeadCommand(collectionManager));
        commands.put("remove_head", new RemoveHeadCommand(collectionManager));
        commands.put("group_counting_by_name", new GroupCountingByNameCommand(collectionManager));
        commands.put("filter_greater_than_height", new FilterGreaterThanHeightCommand(collectionManager));
        commands.put("filter_less_than_location", new FilterLessThanLocationCommand(collectionManager, shellPersonParametrs));
        commands.put("exit", new ExitCommand());
    }

    public void execute(String commandName, String arguments) {

        try {
            Command command = commands.get(commandName);
            command.execute(arguments);
            System.out.println("Введите команду: ");
        } catch (NullPointerException exp) {
            System.out.println("Command [" + commandName + "]" + "not found ");
            System.out.println("Введите команду: ");
        }
    }
    public HashMap<String, Command> getHashMap(){
        return commands;
    }
}
