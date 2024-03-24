package Controler.Commands;

import Controler.CommandManager;
import Controler.ScriptReader;
import DAO.ShellPersonParametrs;
import DAO.CollectionManager;

public class ExecuteScriptCommand implements Command{
    private CollectionManager collectionManager;
    private ShellPersonParametrs shellPersonParametrs;
    public ExecuteScriptCommand(CollectionManager collectionManager, ShellPersonParametrs shellPersonParametrs){
        this.collectionManager = collectionManager;
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
            new ScriptReader(new CommandManager(collectionManager,shellPersonParametrs),argument).start();
        }
        else{
            System.out.println("Некорректный ввод");
        }

    }
}
