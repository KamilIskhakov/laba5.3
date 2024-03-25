package Controler.Commands;

import Controler.CommandRequestManager;
import Controler.ScriptReader;
import DAO.ShellPersonParametrs;
import DAO.CollectionManager;

public class ExecuteScriptCommand implements Command{
    private CollectionManager collectionManager;
    private ShellPersonParametrs shellPersonParametrs;

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
            new ScriptReader(new CommandRequestManager(),argument).start();
        }
        else{
            System.out.println("Некорректный ввод");
        }

    }
}
