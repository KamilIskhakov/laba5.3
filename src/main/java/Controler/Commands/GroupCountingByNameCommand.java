package Controler.Commands;

import DAO.CollectionManager;

public class GroupCountingByNameCommand implements Command{
    private CollectionManager collectionManager;

    @Override
    public String getDescription() {
        return getName() + "сгруппировать элементы коллекции по значению поля name";
    }

    @Override
    public String getName() {
        return "group_counting_by_name ";
    }

    @Override
    public void execute(String argument) {
        if (argument.isEmpty()) {
            int count = 0;
        for(int i : collectionManager.GroupPeople())   {
            if (i>0){
            System.out.println("Группа имён с длинной " + count + ": " + i);}
            count += 1;
            }
        }
        else{
            System.out.println("Некорректный ввод");
        }
    }
}
