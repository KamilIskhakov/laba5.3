package Controler;

import Client.Main;
import CollectionObjects.Person;
import Controler.ShellPersonParametrs;
import DAO.IOManager;

public class PersonCreateHelper {
    private ShellPersonParametrs shellPersonParametrs;
    private IOManager ioManager;
    public PersonCreateHelper(IOManager ioManager, ShellPersonParametrs shellPersonParametrs){
        this.ioManager = ioManager;
        this.shellPersonParametrs = shellPersonParametrs;
    }
    public Person createPeople(){
        if (Main.script) {
            Person per = new Person(
                    shellPersonParametrs.askNameScript(),
                    shellPersonParametrs.askCoordinatesScript(),
                    shellPersonParametrs.askHeightScript(),
                    shellPersonParametrs.askWeightScript(),
                    shellPersonParametrs.askColorScript(),
                    shellPersonParametrs.askCountryScript(),
                    shellPersonParametrs.askLocationScript());
            per.setId(ioManager.generateId());
            return per;
        } else {
            Person per = new Person(
                    shellPersonParametrs.askNameConsole(),
                    shellPersonParametrs.askCoordinatesConsole(),
                    shellPersonParametrs.askHeightConsole(),
                    shellPersonParametrs.askWeightConsole(),
                    shellPersonParametrs.askColorConsole(),
                    shellPersonParametrs.askCountryConsole(),
                    shellPersonParametrs.askLocationConsole()
            );
            per.setId(ioManager.generateId());
            return per;
        }
    }
}
