package Client;

import Controler.CommandManager;

import java.util.Scanner;

public class TerminalCommandShell implements Terminal{
    private CommandManager commandManager;

    public TerminalCommandShell(CommandManager commandManager) {
        this.commandManager = commandManager;
    }
    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        String consoleLine = scanner.nextLine();
        if (consoleLine.contains(" ")) {
            String[] consoleInput = consoleLine.split(" ");
            String commandLine = consoleInput[0];
            String argumentLine = consoleInput[1];
            try {
                commandManager.execute(commandLine, argumentLine);
            } catch (NullPointerException exp) {
                System.out.println("Lol");
            }
        } else {
            String commandLine = consoleLine;
            try {
                commandManager.execute(commandLine, "");
            } catch (NullPointerException exp) {
                System.out.println("Lol");
            }
        }
    }
}
