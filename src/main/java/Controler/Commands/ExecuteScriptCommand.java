package Controler.Commands;

import Controler.CommandManager;
import Controler.ScriptShell;
import Controler.ShellPersonParametrs;
import DAO.IOManager;

public class ExecuteScriptCommand implements Command{
    private IOManager ioManager;
    private ShellPersonParametrs shellPersonParametrs;
    public ExecuteScriptCommand(IOManager ioManager, ShellPersonParametrs shellPersonParametrs){
        this.ioManager = ioManager;
        this.shellPersonParametrs = shellPersonParametrs;
    }
    @Override
    public String getDescription() {
        return getName() + "считывает скрипт пользователя";
    }

    @Override
    public String getName() {
        return "execute_script ";
    }

    @Override
    public void execute(String argument) {
        if (!argument.isEmpty()) {
            new ScriptShell(new CommandManager(ioManager,shellPersonParametrs),argument).start();
        }
        else{
            System.out.println("Некорректный ввод");
        }

    }
}
