package Client;

import Controler.CommandManager;
import Controler.ShellPersonParametrs;
import DAO.IOManager;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static Queue<String> scriptLines = new LinkedList<String>() {};
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);
        ShellPersonParametrs shellPersonParametrs = new ShellPersonParametrs(userScanner);
        IOManager ioManager = new IOManager();
        CommandManager commandManager = new CommandManager(ioManager, shellPersonParametrs);
    }
}
