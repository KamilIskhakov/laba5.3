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
    private InputStream inputStream;
    ArrayDeque<String[]> scriptBox = new ArrayDeque<>();
    private final TerminalOutputManager outputManager;

    public TerminalInput(InputStream inputStream, TerminalOutputManager outputManager) {
        this.inputStream = inputStream;
        this.outputManager = outputManager;
    }

    public String[] readTerminal() {
        try {
            Scanner scanners = new Scanner(inputStream);
            if (scanners.hasNextLine()) {
                if (scanners.nextLine().contains(" ")) {
                    return scanners.nextLine().split(" ");
                }
            } else {
                return new String[]{scanners.nextLine(), ""};

            }
        } catch (Exception e) {
            outputManager.println("Строка по какой-то причине не была прочитана");
            outputManager.printlnWriteCommand();
        }

        return new String[0];
    }


    public void readScript(String scriptPath) {
        Main.script = true;
        File scriptFile = new File(scriptPath);
        Scanner scriptScanner = null;
        try {
            scriptScanner = new Scanner(scriptFile);
        } catch (FileNotFoundException e) {
            Main.script = false;
            System.out.println("Файл не найден");
        }
        if (scriptScanner != null) {
            while (scriptScanner.hasNextLine()) {
                if (scriptScanner.nextLine().contains(" ")) {
                    scriptBox.add(scriptScanner.nextLine().split(" "));
                } else {
                    scriptBox.add(new String[]{scriptScanner.nextLine(), ""});

                }
            }
        }
    }


}
