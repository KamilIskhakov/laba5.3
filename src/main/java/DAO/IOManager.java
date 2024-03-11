package DAO;

import CollectionObjects.Person;
import Service.ToXML;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

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

    public void addToCollection(Person person) {
        personcollection.add(person);
    }

    public void updateCollectionById(Integer id){
        for(Person person : personcollection)
                if(Objects.equals(person.getId(), id))
                    personcollection.remove(person);
    }

    public void save() {
        ToXML.convertToXML(this, filePath);
    }
    public void clear() {
        personcollection.clear();
    }

    public Integer generateId() {
        int count = 0;
        int id = 1;
        while(count != personcollection.size()) {
            for(Person person : personcollection) {
                count++;
                if(person.getId() == id) {
                    id++;
                    count = 0;
                    break;
                }
            }
        }
        return id;
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
