package Controler;

import Client.Main;
import Exceptions.InvalidInputException;
import Exceptions.NotCorrectException;
import Exceptions.PersonAskException;
import com.github.drapostolos.typeparser.TypeParser;
import com.github.drapostolos.typeparser.TypeParserException;

import java.util.HashMap;

public class TerminalManager {
    private final CommandManager commandManager;
    private final TerminalInput inputManager;
    private final TerminalOutputManager outputManager;
    private HashMap<String, Object> askParPerson;
    private HashMap<String, Object> parseData;
    private TypeParser parser;

    public TerminalManager(CommandManager commandManager, TerminalInput inputManager, TerminalOutputManager outputManager) {
        this.commandManager = commandManager;
        this.inputManager = inputManager;
        this.outputManager = outputManager;
        askParPerson = new HashMap<>();
        askParPerson.put("PersonName", );
        TypeParser parser = TypeParser.newBuilder().build();

    }

    public void start() {
        while (true) {
            if (Main.script) {
                for (String[] userLine : inputManager.scriptBox) {
                    try {
                        commandManager.execute(userLine[0], userLine[1]);
                    } catch (PersonAskException e) {

                    }
                }
            }
        }
    }

    public <T> T getAsk(String messageException, String messageWellDone, Class<T> type) throws NotCorrectException{
        if (Main.script) {
            try {
                if ((inputManager.scriptBox.poll()[1]) != "") {
                    Main.script = false;
                    outputManager.println("lol");
                    throw new NotCorrectException();
                } else {
                    String arg = inputManager.scriptBox.poll()[0];
                    T parsLine = parser.parse(arg,type);
                    return parsLine;

                }

            } catch (NullPointerException | TypeParserException |NotCorrectException  e) {
                Main.script = false;
                outputManager.println("lol");
            }
        }

        return null;
    }

}