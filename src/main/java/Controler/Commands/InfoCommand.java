package Controler.Commands;

import DAO.IOManager;

public class InfoCommand implements Command{
    private IOManager ioManager;
    public InfoCommand(IOManager ioManager){
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
        System.out.println(ioManager.collectionInfo());
    }
}
