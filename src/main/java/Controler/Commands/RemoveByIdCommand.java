package Controler.Commands;

import CollectionObjects.Person;
import DAO.IOManager;

import java.util.ArrayDeque;
import java.util.Objects;

public class RemoveByIdCommand implements Command{
    private IOManager ioManager;
    public RemoveByIdCommand(IOManager ioManager){
        this.ioManager = ioManager;

    }
    @Override
    public String getDescription() {
        return getName() + "удаляет элемент очереди по айди";
    }

    @Override
    public String getName() {
        return "remove_by_id ";
    }

    @Override
    public void execute(String argument) {
        if (!argument.isEmpty()) {
            Integer id = Integer.parseInt(argument);
            ioManager.removeCollectionById(id);
        }
        else{

        }

    }
}
