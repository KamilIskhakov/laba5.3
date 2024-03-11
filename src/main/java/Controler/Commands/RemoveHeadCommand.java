package Controler.Commands;

import DAO.IOManager;

public class RemoveHeadCommand implements Command{
    private IOManager ioManager;
    public RemoveHeadCommand(IOManager ioManager){
        this.ioManager = ioManager;
    }
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
            ioManager.removeHead();
        }
        else{
            System.out.println("Некорректный ввод");
        }
    }
}
