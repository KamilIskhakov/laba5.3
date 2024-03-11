package Service;

import DAO.IOManager;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FromXML {
    public static IOManager convertFromXMLt(File fileName) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(IOManager.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (IOManager) unmarshaller.unmarshal(fileName);
    }

}
