package Client;

import Controler.CommandManager;
import Controler.ShellPersonParametrs;
import DAO.IOManager;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import Service.*;
public class Main {
    public static boolean script = false;
    public static Queue<String> scriptLines = new LinkedList<String>() {};
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);
        ShellPersonParametrs shellPersonParametrs = new ShellPersonParametrs(userScanner);
        IOManager ioManager = CollectionCreator.load("save.xml");
        CommandManager commandManager = new CommandManager(ioManager, shellPersonParametrs);
        TerminalShell terminalShell = new TerminalShell(commandManager);
        terminalShell.start();
    }

}
