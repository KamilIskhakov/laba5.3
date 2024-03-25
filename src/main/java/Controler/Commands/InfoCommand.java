package Controler.Commands;

import DAO.CollectionManager;

public class InfoCommand implements Command {
    private CollectionManager collectionManager;
    @Override
    public String getDescription() {
        return getName() + "вывести информацию о коллекции";
    }

    @Override
    public String getName() {
        return "info ";
    }

    @Override
    public void execute(String argument) {
        if (argument.isEmpty()) {
            System.out.println(collectionManager.collectionInfo());
        } else {
            System.out.println("Некорректный ввод");
        }
    }
}