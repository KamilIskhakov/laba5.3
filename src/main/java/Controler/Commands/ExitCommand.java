package Controler.Commands;

import Controler.CommandManager;
import Controler.ScriptShell;

public class ExitCommand implements Command{
    @Override
    public String getDescription() {
        return getName() + "прерывает программу без сохранения";
    }

    @Override
    public String getName() {
        return "exit ";
    }

    @Override
    public void execute(String argument) {
        if (argument.isEmpty()) {
            System.exit(0);
        }
        else{

        }
    }
}
