package Controler.Commands;

import CollectionObjects.Location;
import Service.LocationCreateHelper;
import DAO.ShellPersonParametrs;
import DAO.CollectionManager;

public class FilterLessThanLocationCommand implements Command{
    private CollectionManager collectionManager;
    private ShellPersonParametrs shellPersonParametrs;

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
