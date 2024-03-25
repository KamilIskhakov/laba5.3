package Controler.Commands;

import DAO.CollectionManager;

public class ClearCommand implements Command{
    private CollectionManager collectionManager;

    @Override
    public String getDescription() {
        return getName() + "очищает коллекцию";
    }

    @Override
    public String getName() {
        return "clear ";
    }

    @Override
    public void execute(String argument) {
        if (argument.isEmpty()) {
            collectionManager.clear();
        }
        else{
            System.out.println("Некорректный ввод");
        }
    }
}
