package Client;

import Controler.CommandRequestManager;
import Controler.TerminalInput;
import Controler.TerminalManager;
import Controler.TerminalOutputManager;
import DAO.CollectionManager;

import java.util.LinkedList;
import java.util.Queue;

import Service.*;

public class Main {
    public static boolean script = false;
    public static TerminalOutputManager terminalOutputManager;
    public static ServerEntryPoint serverEntryPoint;
    public static TerminalInput terminalInput;
    public static TerminalManager terminalManager;
    public static void main(String[] args) {
        serverEntryPoint = new ServerEntryPoint();
        terminalOutputManager = new TerminalOutputManager(System.out);
        terminalInput = new TerminalInput(System.in, terminalOutputManager);
        CommandRequestManager commandRequestManager = new CommandRequestManager();
        terminalManager = new TerminalManager(commandRequestManager, terminalInput, terminalOutputManager);
        terminalManager.start();
    }

}
