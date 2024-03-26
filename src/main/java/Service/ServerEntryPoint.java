package Service;

import Controler.Handlers.Handler;
import DAO.CollectionManager;

public class ServerEntryPoint {
    public static CollectionManager collectionManager;
    public ServerEntryPoint(){
        collectionManager = CollectionCreator.load("save.xml");
    }
    public void performCom(Handler handler){
        handler.getCommand().execute();
    }
}
