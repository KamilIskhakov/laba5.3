package Client;

import Controler.CommandRequestManager;
import DAO.ShellPersonParametrs;
import Controler.TerminalInput;
import Controler.TerminalOutputManager;
import DAO.CollectionManager;

import java.util.LinkedList;
import java.util.Queue;

import Service.*;
public class Main {
    public static ShellPersonParametrs shellPersonParametrs;
    public static CollectionManager collectionManager;
    public static boolean script = false;
    public static TerminalOutputManager terminalOutputManager;
    public static TerminalInput terminalInput;
    public static Queue<String> scriptLines = new LinkedList<String>() {};
    public static void main(String[] args) {
        shellPersonParametrs = new ShellPersonParametrs();
        collectionManager = CollectionCreator.load("save.xml");
        terminalOutputManager = new TerminalOutputManager(System.out);
        terminalInput = new TerminalInput(System.in,terminalOutputManager);
        CommandRequestManager commandRequestManager = new CommandRequestManager(collectionManager, shellPersonParametrs);
        TerminalCommandShell terminalCommandShell = new TerminalCommandShell(commandRequestManager);
        terminalCommandShell.start();
    }

}
