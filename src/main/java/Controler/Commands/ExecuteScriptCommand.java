package Controler.Commands;

import Client.Main;
import Controler.CommandRequestManager;
import Controler.TerminalInput;
import DAO.CollectionManager;
import Service.ServerEntryPoint;

public class ExecuteScriptCommand implements Command{
    private String filepath;

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
