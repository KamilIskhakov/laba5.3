package Controler;

public interface Command {
    public String getDescription();
    public String getName();
    public void execute();

}
