package Controler.Commands;

import DAO.CollectionManager;

public class RemoveHeadCommand implements Command{
    private CollectionManager collectionManager;
    @Override
    public String getDescription() {
        return  getName() + "удаляет первый элемент очереди";
    }

    @Override
    public String getName() {
        return "remove_head";
    }

    @Override
    public void execute(String argument) {
        if (argument.isEmpty()) {
            collectionManager.removeHead();
        }
        else{
            System.out.println("Некорректный ввод");
        }
    }
}
