package Controler.Commands;

import DAO.IOManager;

public class InfoCommand implements Command {
    private IOManager ioManager;

    public InfoCommand(IOManager ioManager) {
        this.ioManager = ioManager;
    }

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
            System.out.println(ioManager.collectionInfo());
        } else {
            System.out.println("Некорректный ввод");
        }
    }
}