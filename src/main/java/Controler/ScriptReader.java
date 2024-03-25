package Controler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import Client.*;
public class ScriptReader {
    private CommandRequestManager commandRequestManager;
    private String scriptpath;
    public ScriptReader(CommandRequestManager commandRequestManager, String scriptpath){
        this.commandRequestManager = commandRequestManager;
        this.scriptpath = scriptpath;
    }

    public void start(){
        Main.script = true;
        File scriptFile = new File(scriptpath);
        Scanner scriptScanner = null;
        try {
            scriptScanner = new Scanner(scriptFile);
        }catch (FileNotFoundException e){
            Main.script = false;
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
                commandRequestManager.execute(command,argument);
            }
            else {
                String command = Main.scriptLines.poll();
                commandRequestManager.execute(command,"");
            }
        }
        Main.script = false;
    }
}
