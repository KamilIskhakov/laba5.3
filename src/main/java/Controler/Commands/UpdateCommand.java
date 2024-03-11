package Controler.Commands;

import Client.Main;
import CollectionObjects.Person;
import Controler.ShellPersonParametrs;
import DAO.IOManager;

import java.util.ArrayDeque;
import java.util.Objects;

public class UpdateCommand implements Command{
    private IOManager ioManager;
    private ShellPersonParametrs shellPersonParametrs;
    public UpdateCommand(IOManager ioManager, ShellPersonParametrs shellPersonParametrs){
        this.ioManager = ioManager;
        this.shellPersonParametrs = shellPersonParametrs;
    }
    @Override
    public String getDescription() {
        return getName() + "заменяет на новый объект по айди";
    }

    @Override
    public String getName() {
        return "update ";
    }

    @Override
    public void execute(String argument) {
        if (!argument.isEmpty()) {
            Integer id = Integer.parseInt(argument);
            ArrayDeque<Person> people = new ArrayDeque<>();
            Object[] arrayObjectPeople = ioManager.getCollection().toArray();
            Person[] arrayPeople = new Person[arrayObjectPeople.length];
            for (int i = 0; i < arrayPeople.length; i++) {
                arrayPeople[i] = (Person) arrayObjectPeople[i];
                if (Objects.equals(arrayPeople[i].getId(), id)) {
                    arrayPeople[i] = new PersonCreateHelper(ioManager,shellPersonParametrs).createPeople();
                }
                people.add(arrayPeople[i]);
            }
            ioManager.setPersonCollection(people);
        }
        else{
            System.out.println("Некорректный ввод");
        }
    }
}
