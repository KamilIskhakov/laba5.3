package Client;

import Controler.CommandRequestManager;

import java.util.Scanner;

public class TerminalCommandShell implements Terminal{
    private CommandRequestManager commandRequestManager;

    public TerminalCommandShell(CommandRequestManager commandRequestManager) {
        this.commandRequestManager = commandRequestManager;
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
                commandRequestManager.execute(commandLine, argumentLine);
            } catch (NullPointerException exp) {
                System.out.println("Lol");
            }
        } else {
            String commandLine = consoleLine;
            try {
                commandRequestManager.execute(commandLine, "");
            } catch (NullPointerException exp) {
                System.out.println("Lol");
            }
        }
    }
}
