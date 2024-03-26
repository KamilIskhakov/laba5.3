package Controler.Commands;

import Client.Main;
import Service.ServerEntryPoint;

public class GroupCountingByNameCommand implements Command{

    @Override
    public String getDescription() {
        return getName() + "сгруппировать элементы коллекции по значению поля name";
    }

    @Override
    public String getName() {
        return "group_counting_by_name ";
    }

    @Override
    public void execute() {
            int count = 0;
        for(int i : ServerEntryPoint.collectionManager.GroupPeople())   {
            if (i>0){
            Main.terminalOutputManager.println("Группа имён с длинной " + count + ": " + i);}
            count += 1;
            }
    }
}
