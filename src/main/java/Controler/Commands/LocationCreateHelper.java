package Controler.Commands;

import Client.Main;
import CollectionObjects.Location;
import CollectionObjects.Person;
import Controler.ShellPersonParametrs;
import DAO.IOManager;

public class LocationCreateHelper {
    private IOManager ioManager;
    private ShellPersonParametrs shellPersonParametrs;
    public LocationCreateHelper(IOManager ioManager, ShellPersonParametrs shellPersonParametrs){
        this.ioManager = ioManager;
        this.shellPersonParametrs = shellPersonParametrs;
    }
    public Location createLocation(){
        if (Main.script) {
            Location location = shellPersonParametrs.askLocationScript();
            return location;
        } else {
            Location location = shellPersonParametrs.askLocationConsole();
            return location;
        }
    }
}
