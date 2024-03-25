package Controler.Commands;

import DAO.CollectionManager;

public class SaveCommand implements Command{
    private CollectionManager collectionManager;
    @Override
    public String getDescription() {
        return getName() + "сохраняет все изменения в коллекции";
    }

    @Override
    public String getName() {
        return "save ";
    }

    @Override
    public void execute(String argument) {
        if(argument.isEmpty()){
            collectionManager.save();
        }else {
            System.out.println("Некорректный ввод");
        }
    }
}
