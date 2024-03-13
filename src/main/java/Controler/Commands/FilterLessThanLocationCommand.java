package Controler.Commands;

import CollectionObjects.Location;
import Controler.LocationCreateHelper;
import Controler.ShellPersonParametrs;
import DAO.CollectionManager;

public class FilterLessThanLocationCommand implements Command{
    private CollectionManager collectionManager;
    private ShellPersonParametrs shellPersonParametrs;
    public FilterLessThanLocationCommand(CollectionManager collectionManager, ShellPersonParametrs shellPersonParametrs){
        this.collectionManager = collectionManager;
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
        collectionManager.FilterLessThanLocation(location);
        }
        else{
            System.out.println("Некорректный ввод");
        }
    }
}
