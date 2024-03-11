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
        while(true) {
            String consoleLine = scanner.nextLine();
            if(consoleLine.isEmpty()) {
                continue;
            }
            if(consoleLine.contains(" ")) {
                String[] consoleInput = consoleLine.split(" ");
                String commandLine = consoleInput[0];
                String argumentLine = consoleInput[1];
                try{
                    commandManager.execute(commandLine,argumentLine);
                }catch(NullPointerException exp){
                    System.out.println("Lol");
                }
            }
            else {
                String commandLine = consoleLine;
                try{
                    commandManager.execute(commandLine,"");
                }catch(NullPointerException exp){
                    System.out.println("Lol");
                }
            }

        }
    }
}
