package DAO;

import CollectionObjects.Person;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;
@XmlRootElement(name = "personList")
public class IOManager {
    @XmlElement(name = "person")
    private ArrayDeque<Person> personcollection = new ArrayDeque<>();
    private final Date dateOfInitialization = new Date();
    private String filePath;

    public IOManager(ArrayDeque<Person> personcollection, String filePath) {
        this.personcollection = personcollection;
        this.filePath = filePath;
    }

    public IOManager() {
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * @return string with collection's class, date of creation and size
     */
    public String collectionInfo() {
        return "Collection type: " + personcollection.getClass().getName() + "\n"
                + "Date of initialization: " + dateOfInitialization + "\n"
                + "Collection size: " + personcollection.size();
    }


}
