package Controler;

import Client.Main;
import CollectionObjects.Location;

public class LocationCreateHelper {
    private ShellPersonParametrs shellPersonParametrs;
    public LocationCreateHelper(ShellPersonParametrs shellPersonParametrs){
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
