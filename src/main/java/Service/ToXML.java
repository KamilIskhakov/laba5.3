package Service;

import DAO.IOManager;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ToXML {
    public static void convertToXML(IOManager collectionManager, String fileName) {
        try {
            JAXBContext context = JAXBContext.newInstance(IOManager.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileName));
            marshaller.marshal(collectionManager, bufferedOutputStream);
            bufferedOutputStream.close();
        } catch (JAXBException | IOException e) {
            System.out.println(e);
        }
    }
}
