package Controler.Commands;

import DAO.CollectionManager;

public class HeadCommand implements Command{
    private CollectionManager collectionManager;

    @Override
    public String getDescription() {
        return getName() + "выводит первый элемент очереди";
    }

    @Override
    public String getName() {
        return "head ";
    }

    @Override
    public void execute(String argument) {
        if (argument.isEmpty()) {
            System.out.println(collectionManager.showHead());
        }
        else{
            System.out.println("Некорректный ввод");
        }
    }
}
