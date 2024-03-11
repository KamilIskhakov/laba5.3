package Controler.Commands;

import CollectionObjects.Person;
import DAO.IOManager;

public class FilterGreaterThanHeightCommand implements Command{
    private IOManager ioManager;
    public FilterGreaterThanHeightCommand(IOManager ioManager){
        this.ioManager = ioManager;
    }
    @Override
    public String getDescription() {
        return getName() + "выводит объекты коллекции, у которых поле height меньше заданного";
    }

    @Override
    public String getName() {
        return "filter_greater_than_height ";
    }

    @Override
    public void execute(String argument) {
        if (!argument.isEmpty()) {
            Integer height = Integer.parseInt(argument);
            Object[] arrayObjectPeople = ioManager.getCollection().toArray();
            Person[] arrayPeople = new Person[arrayObjectPeople.length];
            for (int i = 0; i < arrayPeople.length; i++) {
                arrayPeople[i] = (Person) arrayObjectPeople[i];
                if(arrayPeople[i].getHeight() > height ) {
                    System.out.print(arrayPeople[i].getName()+" ");
                }
            }
        }
        else{
            System.out.println("Некорректный ввод");
        }
    }
}
