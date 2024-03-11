package Controler.Commands;

import DAO.IOManager;

public class ClearCommand implements Command{
    private IOManager ioManager;
    public ClearCommand(IOManager ioManager){
        this.ioManager = ioManager;
    }
    @Override
    public String getDescription() {
        return getName() + "очищает коллекцию";
    }

    @Override
    public String getName() {
        return "clear ";
    }

    @Override
    public void execute(String argument) {
        if (argument.isEmpty()) {
            ioManager.clear();
        }
        else{

        }
    }
}
