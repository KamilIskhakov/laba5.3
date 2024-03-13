package Controler.Commands;

import CollectionObjects.Location;
import CollectionObjects.Person;
import Controler.LocationCreateHelper;
import Controler.ShellPersonParametrs;
import DAO.IOManager;

public class FilterLessThanLocationCommand implements Command{
    private  IOManager ioManager;
    private ShellPersonParametrs shellPersonParametrs;
    public FilterLessThanLocationCommand(IOManager ioManager, ShellPersonParametrs shellPersonParametrs){
        this.ioManager = ioManager;
        this.shellPersonParametrs = shellPersonParametrs;
    }
    @Override
    public String getDescription() {
        return getName()+"выводит объекты коллекции, у которых поле location меньше заданного";
    }

    @Override
    public String getName() {
        return "filterr_less_than_location ";
    }

    @Override
    public void execute(String argument) {
        if (argument.isEmpty()) {
        Location location = new LocationCreateHelper(shellPersonParametrs).createLocation();
        ioManager.FilterLessThanLocation(location);
        }
        else{
            System.out.println("Некорректный ввод");
        }
    }
}
