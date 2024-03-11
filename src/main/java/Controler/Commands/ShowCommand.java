package Controler.Commands;

import CollectionObjects.Person;
import DAO.IOManager;

import java.util.Objects;

public class ShowCommand implements Command{
    private IOManager ioManager;
    public ShowCommand(IOManager ioManager){
        this.ioManager = ioManager;
    }
    @Override
    public String getDescription() {
        return getName() + "выводит элементы коллекции";
    }

    @Override
    public String getName() {
        return "show ";
    }

    @Override
    public void execute(String argument) {
        if (argument.isEmpty()){
            for(Person person : ioManager.getCollection()){
                System.out.print(person.getName()+", ");
            }
        }
        else{
            System.out.println("Некорректный ввод");
        }
    }
}
