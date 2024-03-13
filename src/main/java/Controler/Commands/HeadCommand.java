package Controler.Commands;

import DAO.IOManager;

public class HeadCommand implements Command{
    private IOManager ioManager;
    public HeadCommand(IOManager ioManager){
        this.ioManager = ioManager;
    }
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
            System.out.println(ioManager.showHead());
        }
        else{
            System.out.println("Некорректный ввод");
        }
    }
}
