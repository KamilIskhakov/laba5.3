package Controler.Commands;

import DAO.CollectionManager;

public class ShowCommand implements Command{
    private CollectionManager collectionManager;
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
            collectionManager.showCollection();
        }
        else{
            System.out.println("Некорректный ввод");
        }
    }
}
