package DAO;

import Client.Main;
import CollectionObjects.Location;
import CollectionObjects.Person;
import Controler.LocationCreateHelper;
import Controler.PersonCreateHelper;
import Service.ToXML;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.*;
@XmlRootElement(name = "personList")
public class IOManager{
    @XmlElement(name = "person")
    private ArrayDeque<Person> personcollection = new ArrayDeque<>();
    private final Date dateOfInitialization = new Date();
    private String filePath;

    public IOManager(ArrayDeque<Person> personcollection, String filePath) {
        this.personcollection = personcollection;
        this.filePath = filePath;
    }

    public IOManager(){
    }
    private ArrayDeque<Person> getCollection(){
        return personcollection;
    }
    private void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    private void setPersonCollection(ArrayDeque<Person> people){
        personcollection = people;
    }

    public void addToCollection(Person person) {
        personcollection.add(person);
    }

    public void removeCollectionById(Integer id){
        for(Person person : personcollection)
                if(Objects.equals(person.getId(), id))
                    personcollection.remove(person);
    }
    public void removeHead(){
        personcollection.poll();
    }
    public String showHead(){
        return personcollection.getFirst().toString();
    }

    public void save() {
        ToXML.convertToXML(this, filePath);
    }
    public void clear() {
        personcollection.clear();
    }
    public int[] GroupPeople(){
        Object[] arrayObjectPeople = personcollection.toArray();
        Person[] arrayPeople = new Person[arrayObjectPeople.length];
        int[] countName = new int[1024];
        for (int i = 0; i < arrayPeople.length; i++) {
            arrayPeople[i] = (Person) arrayObjectPeople[i];
            int j = arrayPeople[i].getName().length();
            countName[j] += 1;
        }
        return countName;
    }
    public void FilterGreaterThanHeight(Integer height) {
            Object[] arrayObjectPeople = personcollection.toArray();
            Person[] arrayPeople = new Person[arrayObjectPeople.length];
            for (int i = 0; i < arrayPeople.length; i++) {
                arrayPeople[i] = (Person) arrayObjectPeople[i];
                if(arrayPeople[i].getHeight() > height ) {
                    System.out.print(arrayPeople[i].getName()+" ");
                }
            }
        }
    public void FilterLessThanLocation(Location location) {
            Object[] arrayObjectPeople = personcollection.toArray();
            Person[] arrayPeople = new Person[arrayObjectPeople.length];
            for (int i = 0; i < arrayPeople.length; i++) {
                arrayPeople[i] = (Person) arrayObjectPeople[i];
                if(arrayPeople[i].compareTo(location) < 0 ) {
                    System.out.print(arrayPeople[i].getName()+" ");
                }
            }
    }
    public void showCollection() {
        for(Person person : personcollection){
            System.out.print(person.getName()+" ");
        }
        System.out.println(" ");
    }
    public void update(Person userPerson, Integer id) {
        ArrayDeque<Person> people = new ArrayDeque<>();
        Object[] arrayObjectPeople = personcollection.toArray();
        Person[] arrayPeople = new Person[arrayObjectPeople.length];
        for (int i = 0; i < arrayPeople.length; i++) {
            arrayPeople[i] = (Person) arrayObjectPeople[i];
            if (Objects.equals(arrayPeople[i].getId(), id)) {
                arrayPeople[i] = userPerson;
            }
            people.add(arrayPeople[i]);
        }
        setPersonCollection(people);
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
