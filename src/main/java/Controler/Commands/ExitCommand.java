package Controler.Commands;

public class ExitCommand implements Command{
    @Override
    public String getDescription() {
        return getName() + "прерывает программу без сохранения";
    }

    @Override
    public String getName() {
        return "exit ";
    }

    @Override
    public void execute() {
        System.exit(0);
    }
}
