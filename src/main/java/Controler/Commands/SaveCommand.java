package Controler.Commands;

import DAO.IOManager;

public class SaveCommand implements Command{
    private IOManager ioManager;
    public SaveCommand(IOManager ioManager){
        this.ioManager = ioManager;
    }
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
        ioManager.save();
    }
}
