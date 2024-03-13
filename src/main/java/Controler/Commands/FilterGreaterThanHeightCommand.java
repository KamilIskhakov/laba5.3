package Controler.Commands;

import DAO.CollectionManager;

public class FilterGreaterThanHeightCommand implements Command{
    private CollectionManager collectionManager;
    public FilterGreaterThanHeightCommand(CollectionManager collectionManager){
        this.collectionManager = collectionManager;
    }
    @Override
    public String getDescription() {
        return getName() + "выводит объекты коллекции, у которых поле height меньше заданного";
    }

    @Override
    public String getName() {
        return "filter_greater_than_height ";
    }

    @Override
    public void execute(String argument) {
        if (!argument.isEmpty()) {
            Integer height = Integer.parseInt(argument);
            collectionManager.FilterGreaterThanHeight(height);
        }
        else{
            System.out.println("Некорректный ввод");
        }
    }
}
