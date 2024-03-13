package Controler.Commands;

import Client.Main;
import CollectionObjects.Person;
import Controler.PersonCreateHelper;
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
            Person person = new PersonCreateHelper(ioManager,shellPersonParametrs).createPeople();
            ioManager.update(person,id);
        }
        else{
            System.out.println("Некорректный ввод");
        }
    }
}
