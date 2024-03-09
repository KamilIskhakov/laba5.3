package Controler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import Client.*;
public class ScriptShell {
    private CommandManager commandManager;
    private String scriptpath;
    public ScriptShell(CommandManager commandManager){
        this.commandManager = commandManager;
    }

    public ScriptShell(String scriptpath) {
        this.scriptpath = scriptpath;
    }
    public void start(){
        File scriptFile = new File(scriptpath);
        Scanner scriptScanner = null;
        try {
            scriptScanner = new Scanner(scriptFile);
        }catch (FileNotFoundException e){
            System.out.println("File is not founded");
        }
        if(scriptScanner != null) {
            while(scriptScanner.hasNextLine()) {
                Main.scriptLines.add(scriptScanner.nextLine());
            }
        }
        while (!Main.scriptLines.isEmpty()){
            if(Main.scriptLines.peek().contains(" ")) {
                String[] scriptIn = Main.scriptLines.poll().split(" ");
                String command = scriptIn[0];
                String argument = scriptIn[1];
                commandManager.execute(command,argument);
            }
            else {
                String command = Main.scriptLines.poll();
                commandManager.execute(command,"");
            }
        }
    }
}
