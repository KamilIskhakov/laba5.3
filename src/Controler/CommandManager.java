package Controler;

import Controler.Commands.Command;

import java.util.HashMap;
import DAO.*;

public class CommandManager {
    private HashMap<String, Command> commands;

    public CommandManager(IOManager ioManager, ShellPersonParametrs shellPersonParametrs) {
        commands = new HashMap<>();
        commands.put("help", new HelpCommand());
        commands.put("info", new InfoCommand(ioManager));
        commands.put("show", new ShowCommand(ioManager));
        commands.put("add", new AddCommand(ioManager, shellPersonParametrs));
        commands.put("update", new UpdateCommand(ioManager, shellPersonParametrs));
        commands.put("remove_by_ID", new RemoveByIdCommand(ioManager));
        commands.put("clear", new ClearCommand(ioManager));
        commands.put("save", new SaveCommand(ioManager));
        commands.put("execute_script", new ExecuteScriptCommand(ioManager));
        commands.put("add_if_min", new AddIfMinCommand(ioManager, shellPersonParametrs));
        commands.put("remove_greater", new RemoveGreaterCommand(ioManager, shellPersonParametrs));
        commands.put("group_counting_by_id", new GroupCountingByIdCommand(ioManager));
        commands.put("filter_starts_with_name", new FilterStartsWithNameCommand(ioManager, shellPersonParametrs));
        commands.put("print_unique_location", new PrintUniqueLocationCommand(ioManager, shellPersonParametrs));
        commands.put("exit", new ExitCommand());
        this.script = script;
    }

    public void execute(String commandName, String arguments) {

        try {
            Command command = commands.get(commandName);
            command.execute(arguments);
        } catch (NullPointerException exp) {
            System.out.println("Command [" + commandName + "]" + "not found ");
        }
    }
}
