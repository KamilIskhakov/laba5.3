package Controler.Commands;

import CollectionObjects.Location;
import CollectionObjects.Person;
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
        Object[] arrayObjectPeople = ioManager.getCollection().toArray();
        Person[] arrayPeople = new Person[arrayObjectPeople.length];
        Location location = new LocationCreateHelper(ioManager,shellPersonParametrs).createLocation();
        for (int i = 0; i < arrayPeople.length; i++) {
                arrayPeople[i] = (Person) arrayObjectPeople[i];
                if(arrayPeople[i].compareTo(location) < 0 ) {
                    System.out.print(arrayPeople[i].getName()+" ");
                }
            }
        }
        else{
            System.out.println("Некорректный ввод");
        }
    }
}
