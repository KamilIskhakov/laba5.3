package Controler;

import Client.Main;
import CollectionObjects.Coordinates;
import CollectionObjects.Person;
import Exceptions.GiveParPersonException;
import Exceptions.NotCorrectException;
import com.github.drapostolos.typeparser.TypeParser;
import com.github.drapostolos.typeparser.TypeParserException;
import CollectionObjects.*;
import java.util.HashMap;

public class TerminalManager {
    private final CommandRequestManager commandRequestManager;
    private final TerminalInput inputManager;
    private final TerminalOutputManager outputManager;
    private TypeParser parser;

    public TerminalManager(CommandRequestManager commandRequestManager, TerminalInput inputManager, TerminalOutputManager outputManager) {
        this.commandRequestManager = commandRequestManager;
        this.inputManager = inputManager;
        this.outputManager = outputManager;
        TypeParser parser = TypeParser.newBuilder().build();

    }

    public void start() {
        while (true) {
            if (Main.script) {
                for (String[] userLine : inputManager.scriptBox) {
            try {
                commandRequestManager.preparationForShipment(userLine[0], userLine[1]);
            } catch (GiveParPersonException e) {
             e.setPersonCom(new Person.PersonBuilder(getAsk("введите имя:",String.class),
             new Coordinates.CoordinatesBuilder(getAsk("",Float.class), getAsk("",Float.class)).build(),
                     getAsk("",Double.class),getCountryAsk(""))
                     .setColor(getColorAsk(""))
                     .setHeight(getAsk("",Integer.class))
                     .setLocation(new Location.LocationBuilder(getAsk("",String.class),getAsk("",Float.class))
                     .setX(getAsk("", Integer.class))
                     .setZ(getAsk("", Double.class)).build()).build());

                    }
                }
            }
        }
    }

    public <T> T getAsk(String messageWellDone, Class<T> type){
        if (Main.script) {
            try {
                if ((inputManager.scriptBox.poll()[1]) != "") {
                    throw new NotCorrectException();
                } else {
                    String arg = inputManager.scriptBox.poll()[0];
                    T parsLine = parser.parse(arg,type);
                    return parsLine;

                }

            } catch (NullPointerException | TypeParserException |NotCorrectException  e) {
                Main.script = false;
                outputManager.printlnNotCorrectInput();
            }
        }else{
            try {
                outputManager.println(messageWellDone);
                inputManager.readTerminal();
                if ((inputManager.terminalBox.poll()[1]) != "") {
                    throw new NotCorrectException();
                } else {
                    String arg = inputManager.terminalBox.poll()[0];
                    T parsLine = parser.parse(arg,type);
                    return parsLine;

                }
            } catch (NullPointerException | TypeParserException |NotCorrectException  e) {
                outputManager.printlnNotCorrectInput();
                return getAsk(messageWellDone,type);
            }
        }
        return null;
    }
    public Color getColorAsk(String messageWellDone){
        if (Main.script) {
            try {
                if ((inputManager.scriptBox.poll()[1]) != "") {
                    throw new NotCorrectException();
                } else {
                    String arg = inputManager.scriptBox.poll()[0];
                    Color eyeColor = Color.valueOf(arg.toUpperCase());
                    return eyeColor;
                }
            } catch (NullPointerException | TypeParserException |NotCorrectException  e) {
                Main.script = false;
                outputManager.printlnNotCorrectInput();
            }
        }else{
            try {
                outputManager.println(messageWellDone);
                inputManager.readTerminal();
                if ((inputManager.terminalBox.poll()[1]) != "") {
                    throw new NotCorrectException();
                } else {
                    String arg = inputManager.terminalBox.poll()[0];
                    Color eyeColor = Color.valueOf(arg.toUpperCase());
                    return eyeColor;

                }
            } catch (NullPointerException | TypeParserException |NotCorrectException  e) {
                outputManager.printlnNotCorrectInput();
                return getColorAsk(messageWellDone);
            }
        }
        return null;
    }
    public Country getCountryAsk(String messageWellDone){
        if (Main.script) {
            try {
                if ((inputManager.scriptBox.poll()[1]) != "") {
                    throw new NotCorrectException();
                } else {
                    String arg = inputManager.scriptBox.poll()[0];
                    Country nationality = Country.valueOf(arg.toUpperCase());
                    return nationality;
                }
            } catch (NullPointerException | TypeParserException |NotCorrectException  e) {
                Main.script = false;
                outputManager.printlnNotCorrectInput();
            }
        }else{
            try {
                outputManager.println(messageWellDone);
                inputManager.readTerminal();
                if ((inputManager.terminalBox.poll()[1]) != "") {
                    throw new NotCorrectException();
                } else {
                    String arg = inputManager.terminalBox.poll()[0];
                    Country nationality = Country.valueOf(arg.toUpperCase());
                    return nationality;

                }
            } catch (NullPointerException | TypeParserException |NotCorrectException  e) {
                outputManager.printlnNotCorrectInput();
                return getCountryAsk(messageWellDone);
            }
        }
        return null;
    }


}