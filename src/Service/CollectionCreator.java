package Service;

import DAO.IOManager;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.util.ArrayDeque;

public final class CollectionCreator {
    private CollectionCreator() {
    }

    /**
     * builds new Collection Manager from xml-file
     * @param filePath to the xml-file
     * @return new Collection Manager
     * @throws JAXBException if xml-file cannot be converted to java object
     */
    public static IOManager load(String filePath){
        File file = new File(filePath);
        IOManager collectionManager;
        if (file.exists() && file.length() != 0) {
            try {
                collectionManager = FromXML.convertFromXML(file);
            } catch (JAXBException e) {
                throw new RuntimeException(e);
            }
            collectionManager.setFilePath(filePath);
        } else {
            collectionManager = new IOManager(new ArrayDeque<>(), filePath);
        }
        return collectionManager;
    }
}

