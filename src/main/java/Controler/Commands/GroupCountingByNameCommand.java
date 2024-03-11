package Controler.Commands;

import CollectionObjects.Person;
import DAO.IOManager;

import java.util.ArrayDeque;
import java.util.Objects;

public class GroupCountingByNameCommand implements Command{
    private IOManager ioManager;
    public GroupCountingByNameCommand(IOManager ioManager){
        this.ioManager = ioManager;
    }
    @Override
    public String getDescription() {
        return getName() + "сгруппировать элементы коллекции по значению поля name";
    }

    @Override
    public String getName() {
        return "group_counting_by_name ";
    }

    @Override
    public void execute(String argument) {
        if (argument.isEmpty()) {
            Object[] arrayObjectPeople = ioManager.getCollection().toArray();
            Person[] arrayPeople = new Person[arrayObjectPeople.length];
            int[] countName = new int[1024];
            for (int i = 0; i < arrayPeople.length; i++) {
                arrayPeople[i] = (Person) arrayObjectPeople[i];
                int j = arrayPeople[i].getName().length();
                countName[j] += 1;
            }
            for (int i = 1; i < arrayPeople.length; i++){
                if(countName[i] != 0) {
                    System.out.println("Группа имён с длинной " + "i: " + countName[i]);
                }
            }
        }
        else{
            System.out.println("Некорректный ввод");
        }
    }
}
