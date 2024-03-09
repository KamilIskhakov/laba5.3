package Client;

import Controler.CommandManager;

import java.awt.*;
import java.util.Scanner;

public class TerminalShell {
    private CommandManager commandManager;
    public TerminalShell(CommandManager commandManager){
        this.commandManager = commandManager;
    }
    public void start(){
        Scanner scanner = new Scanner(System.in);
        String consoleLine = scanner.nextLine();
        while(true) {
            if(consoleLine.isEmpty()) {
                continue;
            }
            if(consoleLine.contains(" ")) {
                String[] consoleInput = consoleLine.split(" ");
                String commandLine = consoleInput[0];
                String argumentLine = consoleInput[1];
                commandManager.execute(commandLine,argumentLine);
            }
            else {
                String commandLine = consoleLine;
                commandManager.execute(commandLine,"");
            }

        }
    }
}
