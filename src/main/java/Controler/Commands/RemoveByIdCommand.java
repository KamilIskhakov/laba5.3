package Controler.Commands;

import DAO.CollectionManager;

public class RemoveByIdCommand implements Command{
    private CollectionManager collectionManager;
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
            collectionManager.removeCollectionById(id);
        }
        else{
            System.out.println("Некорректный ввод");
        }

    }
}
