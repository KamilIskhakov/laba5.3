package Controler;

import Client.Main;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class TerminalInput {
    ArrayDeque<Scanner> scanners = new ArrayDeque<>();
    ArrayDeque<String[]> terminalBox = new ArrayDeque<>();
    ArrayDeque<String[]> scriptBox = new ArrayDeque<>();
    private final TerminalOutputManager outputManager;

    public TerminalInput(InputStream inputStream, TerminalOutputManager outputManager) {
        scanners.push(new Scanner(inputStream));
        this.outputManager = outputManager;
    }

    public void readTerminal()  {
        if (scanners.peek().hasNextLine()) {
            if(scanners.peek().nextLine().contains(" ")){
                terminalBox.add(scanners.peek().nextLine().split(" "));}
            else{
                terminalBox.add(new String[] {scanners.peek().nextLine(),""});
            }
            scanners.poll();
        }
    }

    public void readScript(String scriptPath) {
        Main.script = true;
        File scriptFile = new File(scriptPath);
        Scanner scriptScanner = null;
        try {
            scriptScanner = new Scanner(scriptFile);
        } catch (FileNotFoundException e) {
            Main.script = false;
            System.out.println("File is not founded");
        }
        if (scriptScanner != null) {
            while (scriptScanner.hasNextLine()) {
                scriptBox.add(scriptScanner.nextLine().split(" "));
            }
        }
    }


}
