package Client;

import Controler.CommandManager;
import Controler.ShellPersonParametrs;
import DAO.IOManager;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static Queue<String> scriptLines = new LinkedList<String>();
    ShellPersonParametrs shellPersonParametrs = new ShellPersonParametrs();
    IOManager ioManager = new IOManager();
    CommandManager commandManager = new CommandManager(ioManager,shellPersonParametrs);

}
