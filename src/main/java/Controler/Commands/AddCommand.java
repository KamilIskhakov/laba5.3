package Controler.Commands;

import Client.Main;
import CollectionObjects.Person;
import Controler.ShellPersonParametrs;
import DAO.IOManager;

public class AddCommand implements Command {
    private IOManager ioManager;
    private ShellPersonParametrs shellPersonParametrs;
    public AddCommand(IOManager ioManager, ShellPersonParametrs shellPersonParametrs){
        this.ioManager = ioManager;
        this.shellPersonParametrs = shellPersonParametrs;
    }
    @Override
    public String getDescription() {
        return getName() + "добавляет новый объект в конец коллекции";
    }

    @Override
    public String getName() {
        return "add ";
    }

    @Override
    public void execute(String argument) {
        if (argument.isEmpty()) {
            Person person = new PersonCreateHelper(ioManager, shellPersonParametrs).createPeople();
            ioManager.addToCollection(person);
        }else{
            System.out.println("Некорректный ввод");
        }
    }
}
