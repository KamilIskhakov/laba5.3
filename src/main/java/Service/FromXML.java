package Service;

import DAO.IOManager;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;


public class FromXML {
    public static IOManager convertFromXML(File fileName) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(IOManager.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (IOManager) unmarshaller.unmarshal(fileName);
    }

}
