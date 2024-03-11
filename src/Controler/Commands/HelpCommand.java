package Controler.Commands;

public class HelpCommand implements Command{
    public HelpCommand() {
        System.out.println("help – вывести справку по доступным командам");
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void execute(String argument) {
        System.out.println("дошел до данной части и выполнил");
    }
}
