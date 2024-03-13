package Controler;

import Client.Main;
import CollectionObjects.Person;
import DAO.CollectionManager;

public class PersonCreateHelper {
    private ShellPersonParametrs shellPersonParametrs;
    private CollectionManager collectionManager;
    public PersonCreateHelper(CollectionManager collectionManager, ShellPersonParametrs shellPersonParametrs){
        this.collectionManager = collectionManager;
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
            per.setId(collectionManager.generateId());
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
            per.setId(collectionManager.generateId());
            return per;
        }
    }
}
