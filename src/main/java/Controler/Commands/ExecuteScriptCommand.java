package Controler.Commands;

import Client.Main;
import Controler.Command;

public class ExecuteScriptCommand implements Command {
    private String filepath;
    public ExecuteScriptCommand(String filepath){
        this.filepath = filepath;
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
    public void execute() {
        Main.terminalInput.readScript(filepath);
    }
}
