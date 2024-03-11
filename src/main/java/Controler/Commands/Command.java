package Controler.Commands;

public interface Command {
    String getDescription();
    String getName();
    public void execute(String argument);
}
